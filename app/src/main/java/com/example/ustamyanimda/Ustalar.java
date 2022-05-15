package com.example.ustamyanimda;

public class Ustalar {

    private int usta_id;
    private String usta_bilgi1;
    private String usta_resim_adi;

    public Ustalar() {
    }

    public Ustalar(int usta_id, String usta_bilgi, String usta_resim_adi) {
        this.usta_id = usta_id;
        this.usta_bilgi1 = usta_bilgi;
        this.usta_resim_adi = usta_resim_adi;
    }

    public int getUsta_id() {
        return usta_id;
    }

    public void setUsta_id(int usta_id) {
        this.usta_id = usta_id;
    }

    public String getUsta_bilgi() {
        return usta_bilgi1;
    }

    public void setUsta_bilgi(String usta_bilgi) {
        this.usta_bilgi1 = usta_bilgi;
    }

    public String getUsta_resim_adi() {
        return usta_resim_adi;
    }

    public void setUsta_resim_adi(String usta_resim_adi) {
        this.usta_resim_adi = usta_resim_adi;
    }
}
