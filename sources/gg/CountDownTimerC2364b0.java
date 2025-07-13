package gg;

/* renamed from: gg.b0 */
/* loaded from: classes.dex */
public final class CountDownTimerC2364b0 extends android.os.CountDownTimer {

    /* renamed from: b */
    public static final /* synthetic */ int f10689b = 0;

    /* renamed from: a */
    public final /* synthetic */ gg.C2369g f10690a;

    public CountDownTimerC2364b0(long r3, gg.C2369g r5) {
            r2 = this;
            r2.f10690a = r5
            r0 = 1000(0x3e8, double:4.94E-321)
            r2.<init>(r3, r0)
            return
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
            r5 = this;
            gg.g r0 = r5.f10690a
            androidx.lifecycle.d0<java.lang.Long> r0 = r0.f10717l
            r1 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.mo1415j(r1)
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            gg.g r1 = r5.f10690a
            gg.f r2 = new gg.f
            r3 = 2
            r2.<init>(r1, r3)
            r3 = 1500(0x5dc, double:7.41E-321)
            r0.postDelayed(r2, r3)
            return
    }

    @Override // android.os.CountDownTimer
    public void onTick(long r2) {
            r1 = this;
            gg.g r0 = r1.f10690a
            androidx.lifecycle.d0<java.lang.Long> r0 = r0.f10717l
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.mo1415j(r2)
            return
    }
}
