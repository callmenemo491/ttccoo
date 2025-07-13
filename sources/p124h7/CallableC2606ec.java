package p124h7;

/* renamed from: h7.ec */
/* loaded from: classes.dex */
public final class CallableC2606ec implements java.util.concurrent.Callable<p124h7.C2623fb<p124h7.C2948xc>> {

    /* renamed from: a */
    public final p124h7.C2948xc f11482a;

    /* renamed from: b */
    public final android.content.Context f11483b;

    public CallableC2606ec(p124h7.C2948xc r1, android.content.Context r2) {
            r0 = this;
            r0.<init>()
            r0.f11482a = r1
            r0.f11483b = r2
            return
    }

    @Override // java.util.concurrent.Callable
    public final p124h7.C2623fb<p124h7.C2948xc> call() {
            r8 = this;
            java.lang.Object r0 = p184k6.C3702e.f16404c
            k6.e r0 = p184k6.C3702e.f16405d
            android.content.Context r1 = r8.f11483b
            r2 = 12451000(0xbdfcb8, float:1.7447567E-38)
            r0.mo8164b(r1, r2)
            android.content.Context r0 = r8.f11483b
            h7.xc r1 = r8.f11482a
            java.lang.String r1 = r1.f12022Z
            com.google.android.gms.common.internal.C1101a.m3100e(r1)
            h7.xc r2 = new h7.xc
            r2.<init>(r1)
            r1 = 1
            r2.f11542Y = r1
            h7.hb r1 = new h7.hb
            l6.a<h7.xc> r3 = p124h7.C2966yc.f12039a
            o9.f r4 = new o9.f
            r4.<init>()
            android.os.Looper r5 = android.os.Looper.getMainLooper()
            l6.c$a r6 = new l6.c$a
            r7 = 0
            r6.<init>(r4, r7, r5)
            r1.<init>(r0, r3, r2, r6)
            h7.fb r0 = new h7.fb
            r0.<init>(r1)
            return r0
    }
}
