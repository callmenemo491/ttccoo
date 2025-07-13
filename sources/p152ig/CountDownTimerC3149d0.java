package p152ig;

/* renamed from: ig.d0 */
/* loaded from: classes.dex */
public final class CountDownTimerC3149d0 extends android.os.CountDownTimer {

    /* renamed from: a */
    public final /* synthetic */ p152ig.C3153h f12603a;

    public CountDownTimerC3149d0(p152ig.C3153h r5) {
            r4 = this;
            r4.f12603a = r5
            r0 = 3600000(0x36ee80, double:1.7786363E-317)
            r2 = 1500(0x5dc, double:7.41E-321)
            r4.<init>(r0, r2)
            return
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
            r0 = this;
            return
    }

    @Override // android.os.CountDownTimer
    public void onTick(long r2) {
            r1 = this;
            ig.h r2 = r1.f12603a
            ig.h$a r2 = r2.f12617m
            if (r2 == 0) goto L15
            double r2 = r2.m7609a()
            ig.h r0 = r1.f12603a
            androidx.lifecycle.d0<java.lang.Double> r0 = r0.f12613i
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r0.mo7l(r2)
        L15:
            return
    }
}
