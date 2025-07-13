package p164j6;

/* renamed from: j6.n */
/* loaded from: classes.dex */
public abstract class AbstractC3440n<T> {

    /* renamed from: a */
    public final int f14905a;

    /* renamed from: b */
    public final p327s7.C5986j<T> f14906b;

    /* renamed from: c */
    public final int f14907c;

    /* renamed from: d */
    public final android.os.Bundle f14908d;

    public AbstractC3440n(int r2, int r3, android.os.Bundle r4) {
            r1 = this;
            r1.<init>()
            s7.j r0 = new s7.j
            r0.<init>()
            r1.f14906b = r0
            r1.f14905a = r2
            r1.f14907c = r3
            r1.f14908d = r4
            return
    }

    /* renamed from: a */
    public abstract void mo7904a(android.os.Bundle r1);

    /* renamed from: b */
    public final void m7907b(p164j6.C3439m r6) {
            r5 = this;
            java.lang.String r0 = "MessengerIpcClient"
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            if (r1 == 0) goto L38
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r2 = java.lang.String.valueOf(r6)
            int r3 = r1.length()
            int r3 = r3 + 14
            int r4 = r2.length()
            int r4 = r4 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r4)
            java.lang.String r4 = "Failing "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " with "
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            android.util.Log.d(r0, r1)
        L38:
            s7.j<T> r0 = r5.f14906b
            s7.q<TResult> r0 = r0.f23075a
            r0.m12472q(r6)
            return
    }

    /* renamed from: c */
    public final void m7908c(T r6) {
            r5 = this;
            java.lang.String r0 = "MessengerIpcClient"
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            if (r1 == 0) goto L38
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r2 = java.lang.String.valueOf(r6)
            int r3 = r1.length()
            int r3 = r3 + 16
            int r4 = r2.length()
            int r4 = r4 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r4)
            java.lang.String r4 = "Finishing "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " with "
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            android.util.Log.d(r0, r1)
        L38:
            s7.j<T> r0 = r5.f14906b
            s7.q<TResult> r0 = r0.f23075a
            r0.m12473r(r6)
            return
    }

    /* renamed from: d */
    public abstract boolean mo7905d();

    public java.lang.String toString() {
            r5 = this;
            int r0 = r5.f14907c
            int r1 = r5.f14905a
            boolean r2 = r5.mo7905d()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 55
            r3.<init>(r4)
            java.lang.String r4 = "Request { what="
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = " id="
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = " oneWay="
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = "}"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            return r0
    }
}
