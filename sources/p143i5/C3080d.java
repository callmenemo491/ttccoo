package p143i5;

/* renamed from: i5.d */
/* loaded from: classes.dex */
public class C3080d extends p143i5.AbstractC3087k {

    /* renamed from: c0 */
    public final /* synthetic */ p143i5.AbstractC3081e f12428c0;

    public C3080d(p143i5.AbstractC3081e r1) {
            r0 = this;
            r0.f12428c0 = r1
            r0.<init>()
            return
    }

    @Override // p142i4.AbstractC3074h
    /* renamed from: t */
    public void mo7527t() {
            r5 = this;
            i5.e r0 = r5.f12428c0
            java.lang.Object r1 = r0.f12371b
            monitor-enter(r1)
            r5.m7542u()     // Catch: java.lang.Throwable -> L17
            O extends i4.h[] r2 = r0.f12375f     // Catch: java.lang.Throwable -> L17
            int r3 = r0.f12377h     // Catch: java.lang.Throwable -> L17
            int r4 = r3 + 1
            r0.f12377h = r4     // Catch: java.lang.Throwable -> L17
            r2[r3] = r5     // Catch: java.lang.Throwable -> L17
            r0.m7530g()     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            return
        L17:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r0
    }
}
