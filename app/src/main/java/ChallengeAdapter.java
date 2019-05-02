import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;


public class ChallengeAdapter extends RecyclerView.Adapter<ChallengeAdapter.ChallengeViewHolder> {


    @NonNull
    @Override
    public ChallengeViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ChallengeViewHolder challengeViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ChallengeViewHolder extends RecyclerView.ViewHolder {
        public ChallengeViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
