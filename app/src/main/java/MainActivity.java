import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.miau.R;

public class MainActivity extends AppCompatActivity {

    private ImageView backButton;
    private TextView notificationText;
    private ImageView iconNotification;
    private ImageView iconBag;
    private ImageView notifIcon;
    private TextView welcomeText;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializa os componentes da interface
        backButton = findViewById(R.id.back_button);
        notificationText = findViewById(R.id.textView3);
        iconNotification = findViewById(R.id.icon_notification2);
        iconBag = findViewById(R.id.icon_bag);
        notifIcon = findViewById(R.id.noticf);
        welcomeText = findViewById(R.id.textView4);

        // Define ações para os elementos
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ação do botão de voltar
                onBackPressed();
            }
        });

        // Adicionar ações adicionais conforme necessário para outros componentes
    }
}
