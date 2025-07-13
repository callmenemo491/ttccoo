package gg;

/* renamed from: gg.a0 */
/* loaded from: classes.dex */
public final class CountDownTimerC2362a0 extends android.os.CountDownTimer {

    /* renamed from: a */
    public final /* synthetic */ gg.C2369g f10686a;

    public CountDownTimerC2362a0(gg.C2369g r5) {
            r4 = this;
            r4.f10686a = r5
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
    public void onTick(long r1) {
            r0 = this;
            gg.g r1 = r0.f10686a
            androidx.lifecycle.d0<java.util.List<od.h0>> r1 = r1.f10715j
            java.lang.Object r1 = r1.m1411d()
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L13
            gg.g r2 = r0.f10686a
            androidx.lifecycle.d0<java.util.List<od.h0>> r2 = r2.f10715j
            r2.mo7l(r1)
        L13:
            return
    }
}
