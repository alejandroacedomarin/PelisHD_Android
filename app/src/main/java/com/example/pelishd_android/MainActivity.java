package com.example.pelishd_android;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TextView textViewTitle = findViewById(R.id.textViewTitle);
        textViewTitle.setText(getString(R.string.title_text));

        // Configurar texto para la descripción
        TextView textViewDescription = findViewById(R.id.textViewWelcome);
        textViewDescription.setText("Explora, organiza y descubre tus películas favoritas:\n\n" +
                "• Busca: Encuentra películas por título, género o año.\n" +
                "• Organiza: Crea listas de películas para ver o compartir.\n" +
                "• Descubre: Recomendaciones y nuevos estrenos.\n\n" +
                "🎬 ¡Empieza tu experiencia cinematográfica ahora!");

    }
}