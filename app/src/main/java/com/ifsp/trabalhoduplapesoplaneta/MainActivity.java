package com.ifsp.trabalhoduplapesoplaneta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.google.android.material.textfield.TextInputEditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private TextView txtvResGravidade;
    private TextInputEditText txtiPeso;
    private ToggleButton tbPeso;
    private ImageView imgPlaneta;
    private RadioGroup rgPlanetas;
    private RadioButton rbMercurio, rbVenus, rbMarte, rbJupter, rbSaturno, rbUrano, rbTerra, rbNetuno;
    double pesoPlaneta, pesoTerra, pesoRes;
    DecimalFormat formato = new DecimalFormat("#.###");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtvResGravidade = findViewById(R.id.lblResult);
        txtiPeso = findViewById(R.id.txtWeight);
        tbPeso = findViewById(R.id.tgbWeight);
        imgPlaneta = findViewById(R.id.imgPlanet);
        rgPlanetas = findViewById(R.id.rgpPlanet);
        rbJupter = findViewById(R.id.rbtJupiter);
        rbMercurio = findViewById(R.id.rbtMercury);
        rbVenus = findViewById(R.id.rbtVenus);
        rbMarte = findViewById(R.id.rbtMars);
        rbSaturno = findViewById(R.id.rbtSaturn);
        rbUrano = findViewById(R.id.rbtUranus);
        rbTerra = findViewById(R.id.rbtEarth);
        rbNetuno = findViewById(R.id.rbtNeptune);

        this.checarRadioButton();

    }

    public void checarRadioButton(){
        rgPlanetas.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                imgPlaneta.setVisibility(View.VISIBLE);
                if(checkedId == R.id.rbtMercury){
                    imgPlaneta.setImageResource(R.drawable.mercury);
                    pesoPlaneta=0.37;
                    pesoTerra = Float.parseFloat(txtiPeso.getText().toString());
                    pesoRes = pesoTerra*pesoPlaneta;
                    txtvResGravidade.setText("Neste planeta, este peso é igual a "+formato.format(pesoRes)+" Kg");
                }else if(checkedId == R.id.rbtVenus){
                    imgPlaneta.setImageResource(R.drawable.venus);
                    pesoPlaneta = 0.88;
                    pesoTerra = Float.parseFloat(txtiPeso.getText().toString());
                    pesoRes = pesoTerra*pesoPlaneta;
                    txtvResGravidade.setText("Neste planeta, este peso é igual a "+formato.format(pesoRes)+" Kg");
                }else if(checkedId == R.id.rbtMars){
                    imgPlaneta.setImageResource(R.drawable.mars);
                    pesoPlaneta = 0.38;
                    pesoTerra = Float.parseFloat(txtiPeso.getText().toString());
                    pesoRes = pesoTerra*pesoPlaneta;
                    txtvResGravidade.setText("Neste planeta, este peso é igual a "+formato.format(pesoRes)+" Kg");
                }else if(checkedId == R.id.rbtJupiter){
                    imgPlaneta.setImageResource(R.drawable.jupiter);
                    pesoPlaneta = 2.64;
                    pesoTerra = Float.parseFloat(txtiPeso.getText().toString());
                    pesoRes = pesoTerra*pesoPlaneta;
                    txtvResGravidade.setText("Neste planeta, este peso é igual a "+formato.format(pesoRes)+" Kg");
                }else if(checkedId == R.id.rbtSaturn){
                    imgPlaneta.setImageResource(R.drawable.saturn);
                    pesoPlaneta = 1.15;
                    pesoTerra = Float.parseFloat(txtiPeso.getText().toString());
                    pesoRes = pesoTerra*pesoPlaneta;
                    txtvResGravidade.setText("Neste planeta, este peso é igual a "+formato.format(pesoRes)+" Kg");
                }else if(checkedId == R.id.rbtUranus){
                    imgPlaneta.setImageResource(R.drawable.uranus);
                    pesoPlaneta = 1.17;
                    pesoTerra = Float.parseFloat(txtiPeso.getText().toString());
                    pesoRes = pesoTerra*pesoPlaneta;
                    txtvResGravidade.setText("Neste planeta, este peso é igual a "+formato.format(pesoRes)+" Kg");
                }else if(checkedId == R.id.rbtEarth){
                    imgPlaneta.setImageResource(R.drawable.earth);
                    pesoPlaneta = 1;
                    pesoTerra = Float.parseFloat(txtiPeso.getText().toString());
                    pesoRes = pesoTerra*pesoPlaneta;
                    txtvResGravidade.setText("Neste planeta, este peso é igual a "+formato.format(pesoRes)+" Kg");
                }else if(checkedId == R.id.rbtNeptune){
                    imgPlaneta.setImageResource(R.drawable.neptune);
                    pesoPlaneta = 1.18;
                    pesoTerra = Float.parseFloat(txtiPeso.getText().toString());
                    pesoRes = pesoTerra*pesoPlaneta;
                    txtvResGravidade.setText("Neste planeta, este peso é igual a "+formato.format(pesoRes)+" Kg");
                }
            }
        });
    }

    public void ativarInputPeso(View v){
        if(tbPeso.isChecked()){
            txtiPeso.setText("");
            txtiPeso.setEnabled(true);
            rbNetuno.setEnabled(true);
            rbTerra.setEnabled(true);
            rbMercurio.setEnabled(true);
            rbSaturno.setEnabled(true);
            rbVenus.setEnabled(true);
            rbMarte.setEnabled(true);
            rbJupter.setEnabled(true);
            rbUrano.setEnabled(true);
        }else{
            txtiPeso.setText("");
            txtvResGravidade.setText("");
            imgPlaneta.setVisibility(View.INVISIBLE);
            txtiPeso.setEnabled(false);
            rbNetuno.setEnabled(false);
            rbTerra.setEnabled(false);
            rbMercurio.setEnabled(false);
            rbSaturno.setEnabled(false);
            rbVenus.setEnabled(false);
            rbMarte.setEnabled(false);
            rbJupter.setEnabled(false);
            rbUrano.setEnabled(false);
        }
    }

}