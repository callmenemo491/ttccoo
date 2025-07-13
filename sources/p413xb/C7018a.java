package p413xb;

/* renamed from: xb.a */
/* loaded from: classes.dex */
public final class C7018a implements android.hardware.SensorEventListener {

    /* renamed from: a */
    public ad.C0062e f27336a;

    /* renamed from: b */
    public ad.C0063f f27337b;

    /* renamed from: c */
    public android.content.Context f27338c;

    /* renamed from: d */
    public android.os.Handler f27339d;

    public C7018a(android.content.Context r1, ad.C0062e r2, ad.C0063f r3) {
            r0 = this;
            r0.<init>()
            r0.f27338c = r1
            r0.f27336a = r2
            r0.f27337b = r3
            android.os.Handler r1 = new android.os.Handler
            r1.<init>()
            r0.f27339d = r1
            return
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor r1, int r2) {
            r0 = this;
            return
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent r3) {
            r2 = this;
            float[] r3 = r3.values
            r0 = 0
            r3 = r3[r0]
            ad.e r1 = r2.f27336a
            if (r1 == 0) goto L2b
            r1 = 1110704128(0x42340000, float:45.0)
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 > 0) goto L1b
            r3 = 1
            android.os.Handler r0 = r2.f27339d
            h4.l r1 = new h4.l
            r1.<init>(r2, r3)
            r0.post(r1)
            goto L2b
        L1b:
            r1 = 1138819072(0x43e10000, float:450.0)
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 < 0) goto L2b
            android.os.Handler r3 = r2.f27339d
            h4.l r1 = new h4.l
            r1.<init>(r2, r0)
            r3.post(r1)
        L2b:
            return
    }
}
