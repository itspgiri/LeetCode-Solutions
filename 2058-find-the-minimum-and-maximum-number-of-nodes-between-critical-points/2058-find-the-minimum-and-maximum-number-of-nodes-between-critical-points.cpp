class Solution {
public:
    vector<int> nodesBetweenCriticalPoints(ListNode* head) {
        int minDist=INT_MAX , maxDist=INT_MIN , critical_points=0;
    ListNode *prev=head , *temp=head->next;
    int start=0 , end=1 , mid=0;
    while(temp->next){
        
        // cout<<"Prev Value : "<<prev->val<<" Curr Val : "<<temp->val<<" Next Val : "<<temp->next->val<<endl;
        if((temp->val>prev->val and temp->val>temp->next->val)or(temp->val<prev->val and temp->val<temp->next->val)){
            critical_points++;
            if(critical_points>=2){
                minDist=min(minDist , end-mid);
                maxDist=max(maxDist , end-start);
                mid=end;
            }
        }
        if(critical_points==1 and start==0){
            start=end , mid=end;
        }
        prev=temp;
        temp=temp->next;
        end++;
    }
    // cout<<"Critical Points "<<critical_points<<endl;
    if(critical_points>=2) return {minDist , maxDist};
    return {-1 , -1};
}
};