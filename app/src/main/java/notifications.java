import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.miau.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Conecta ao XML

        // Obtendo o container pai (ConstraintLayout)
        @SuppressLint({"MissingInflatedId", "LocalSuppress", "WrongViewCast"}) ConstraintLayout parentContainer = findViewById(R.id.child_view); // Adicione um ID no XML se necessário

        // Acessando o elemento filho
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) View childView = findViewById(R.id.child_view);

        // Exemplo: Adicionando um clique ao filho
        childView.setOnClickListener(v ->
                Toast.makeText(this, "Elemento clicado!", Toast.LENGTH_SHORT).show()
        );
    }
}
