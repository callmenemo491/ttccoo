package p192kf;

/* renamed from: kf.g */
/* loaded from: classes.dex */
public final class CountDownTimerC4110g extends android.os.CountDownTimer {

    /* renamed from: a */
    public final /* synthetic */ p171jd.C3504e0 f17088a;

    public CountDownTimerC4110g(long r3, p171jd.C3504e0 r5) {
            r2 = this;
            r2.f17088a = r5
            r0 = 1000(0x3e8, double:4.94E-321)
            r2.<init>(r3, r0)
            return
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
            r2 = this;
            jd.e0 r0 = r2.f17088a
            com.google.android.material.button.MaterialButton r0 = r0.f15108d
            java.lang.String r1 = "harvest"
            r0.setText(r1)
            jd.e0 r0 = r2.f17088a
            com.google.android.material.button.MaterialButton r0 = r0.f15108d
            r1 = 1
            r0.setEnabled(r1)
            jd.e0 r0 = r2.f17088a
            com.google.android.material.button.MaterialButton r0 = r0.f15108d
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r1)
            return
    }

    @Override // android.os.CountDownTimer
    public void onTick(long r3) {
            r2 = this;
            jd.e0 r0 = r2.f17088a
            com.google.android.material.button.MaterialButton r0 = r0.f15108d
            java.lang.String r1 = "harvest"
            java.lang.String r3 = vg.C6672m.m13531r(r3, r1)
            r0.setText(r3)
            return
    }
}
