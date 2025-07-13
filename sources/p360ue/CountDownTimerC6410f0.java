package p360ue;

/* renamed from: ue.f0 */
/* loaded from: classes.dex */
public final class CountDownTimerC6410f0 extends android.os.CountDownTimer {

    /* renamed from: a */
    public final /* synthetic */ p171jd.C3504e0 f24953a;

    public CountDownTimerC6410f0(long r1, p171jd.C3504e0 r3, java.lang.String r4) {
            r0 = this;
            r0.f24953a = r3
            r3 = 1000(0x3e8, double:4.94E-321)
            r0.<init>(r1, r3)
            return
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
            r2 = this;
            jd.e0 r0 = r2.f24953a
            com.google.android.material.button.MaterialButton r0 = r0.f15108d
            java.lang.String r1 = "BRAWL"
            r0.setText(r1)
            jd.e0 r0 = r2.f24953a
            com.google.android.material.button.MaterialButton r0 = r0.f15108d
            r1 = 1
            r0.setEnabled(r1)
            jd.e0 r0 = r2.f24953a
            com.google.android.material.button.MaterialButton r0 = r0.f15108d
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r1)
            return
    }

    @Override // android.os.CountDownTimer
    public void onTick(long r3) {
            r2 = this;
            jd.e0 r0 = r2.f24953a
            com.google.android.material.button.MaterialButton r0 = r0.f15108d
            java.lang.String r1 = "BRAWL"
            java.lang.String r3 = vg.C6672m.m13531r(r3, r1)
            r0.setText(r3)
            return
    }
}
