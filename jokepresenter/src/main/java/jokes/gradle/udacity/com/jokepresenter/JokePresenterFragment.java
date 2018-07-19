package jokes.gradle.udacity.com.jokepresenter;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Vlad
 */

public class JokePresenterFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_joke, container, false);
        TextView jokeTextView = rootView.findViewById(R.id.joke_tv);

        Intent intent = getActivity().getIntent();
        String joke = null;
        if (intent != null){
            joke = intent.getStringExtra(getString(R.string.joke_key));
        }

        if (joke != null) {
            jokeTextView.setText(joke);
        }
        else {
            jokeTextView.setText("No joke passed through an Intent");
        }

        return rootView;
    }
}
