package p371v5;

/* renamed from: v5.y */
/* loaded from: classes.dex */
public class C6575y<V> {

    /* renamed from: a */
    public final /* synthetic */ int f25721a;

    /* renamed from: b */
    public java.lang.Object f25722b;

    /* renamed from: c */
    public V[] f25723c;

    /* renamed from: d */
    public int f25724d;

    /* renamed from: e */
    public int f25725e;

    public C6575y() {
            r1 = this;
            r0 = 0
            r1.f25721a = r0
            r0 = 10
            r1.<init>(r0)
            return
    }

    public C6575y(int r2) {
            r1 = this;
            r0 = 0
            r1.f25721a = r0
            r1.<init>()
            long[] r0 = new long[r2]
            r1.f25722b = r0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r1.f25723c = r2
            return
    }

    public C6575y(java.lang.CharSequence r2, int r3, int r4) {
            r1 = this;
            r0 = 1
            r1.f25721a = r0
            r1.<init>()
            r1.f25722b = r2
            r1.f25725e = r3
            r1.f25724d = r4
            int r3 = r3 * r4
            byte[] r2 = new byte[r3]
            r1.f25723c = r2
            r3 = -1
            java.util.Arrays.fill(r2, r3)
            return
    }

    /* renamed from: a */
    public synchronized void m13429a(long r5, V r7) {
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.f25725e     // Catch: java.lang.Throwable -> L3c
            if (r0 <= 0) goto L1d
            int r1 = r4.f25724d     // Catch: java.lang.Throwable -> L3c
            int r1 = r1 + r0
            int r1 = r1 + (-1)
            V[] r0 = r4.f25723c     // Catch: java.lang.Throwable -> L3c
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch: java.lang.Throwable -> L3c
            int r0 = r0.length     // Catch: java.lang.Throwable -> L3c
            int r1 = r1 % r0
            java.lang.Object r0 = r4.f25722b     // Catch: java.lang.Throwable -> L3c
            long[] r0 = (long[]) r0     // Catch: java.lang.Throwable -> L3c
            r1 = r0[r1]     // Catch: java.lang.Throwable -> L3c
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L1d
            r4.m13430b()     // Catch: java.lang.Throwable -> L3c
        L1d:
            r4.m13435g()     // Catch: java.lang.Throwable -> L3c
            int r0 = r4.f25724d     // Catch: java.lang.Throwable -> L3c
            int r1 = r4.f25725e     // Catch: java.lang.Throwable -> L3c
            int r0 = r0 + r1
            V[] r2 = r4.f25723c     // Catch: java.lang.Throwable -> L3c
            r3 = r2
            java.lang.Object[] r3 = (java.lang.Object[]) r3     // Catch: java.lang.Throwable -> L3c
            int r3 = r3.length     // Catch: java.lang.Throwable -> L3c
            int r0 = r0 % r3
            java.lang.Object r3 = r4.f25722b     // Catch: java.lang.Throwable -> L3c
            long[] r3 = (long[]) r3     // Catch: java.lang.Throwable -> L3c
            r3[r0] = r5     // Catch: java.lang.Throwable -> L3c
            java.lang.Object[] r2 = (java.lang.Object[]) r2     // Catch: java.lang.Throwable -> L3c
            r2[r0] = r7     // Catch: java.lang.Throwable -> L3c
            int r1 = r1 + 1
            r4.f25725e = r1     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r4)
            return
        L3c:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    /* renamed from: b */
    public synchronized void m13430b() {
            r2 = this;
            monitor-enter(r2)
            r0 = 0
            r2.f25724d = r0     // Catch: java.lang.Throwable -> L10
            r2.f25725e = r0     // Catch: java.lang.Throwable -> L10
            V[] r0 = r2.f25723c     // Catch: java.lang.Throwable -> L10
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch: java.lang.Throwable -> L10
            r1 = 0
            java.util.Arrays.fill(r0, r1)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r2)
            return
        L10:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    /* renamed from: c */
    public void m13431c(int r7) {
            r6 = this;
            int r0 = r6.f25724d
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r6.m13437i(r0, r2, r7, r1)
            int r0 = r6.f25724d
            int r0 = r0 - r1
            r3 = 2
            r6.m13437i(r0, r1, r7, r3)
            int r0 = r6.f25724d
            int r0 = r0 - r1
            r4 = 3
            r6.m13437i(r0, r3, r7, r4)
            int r0 = r6.f25725e
            int r0 = r0 - r3
            r5 = 4
            r6.m13437i(r2, r0, r7, r5)
            int r0 = r6.f25725e
            int r0 = r0 - r1
            r5 = 5
            r6.m13437i(r2, r0, r7, r5)
            int r0 = r6.f25725e
            int r0 = r0 - r1
            r2 = 6
            r6.m13437i(r1, r0, r7, r2)
            int r0 = r6.f25725e
            int r0 = r0 - r1
            r2 = 7
            r6.m13437i(r3, r0, r7, r2)
            int r0 = r6.f25725e
            int r0 = r0 - r1
            r1 = 8
            r6.m13437i(r4, r0, r7, r1)
            return
    }

    /* renamed from: d */
    public void m13432d(int r7) {
            r6 = this;
            int r0 = r6.f25724d
            r1 = 3
            int r0 = r0 - r1
            r2 = 0
            r3 = 1
            r6.m13437i(r0, r2, r7, r3)
            int r0 = r6.f25724d
            r4 = 2
            int r0 = r0 - r4
            r6.m13437i(r0, r2, r7, r4)
            int r0 = r6.f25724d
            int r0 = r0 - r3
            r6.m13437i(r0, r2, r7, r1)
            int r0 = r6.f25725e
            r5 = 4
            int r0 = r0 - r5
            r6.m13437i(r2, r0, r7, r5)
            int r0 = r6.f25725e
            int r0 = r0 - r1
            r1 = 5
            r6.m13437i(r2, r0, r7, r1)
            int r0 = r6.f25725e
            int r0 = r0 - r4
            r1 = 6
            r6.m13437i(r2, r0, r7, r1)
            int r0 = r6.f25725e
            int r0 = r0 - r3
            r1 = 7
            r6.m13437i(r2, r0, r7, r1)
            int r0 = r6.f25725e
            int r0 = r0 - r3
            r1 = 8
            r6.m13437i(r3, r0, r7, r1)
            return
    }

    /* renamed from: e */
    public void m13433e(int r7) {
            r6 = this;
            int r0 = r6.f25724d
            r1 = 3
            int r0 = r0 - r1
            r2 = 0
            r3 = 1
            r6.m13437i(r0, r2, r7, r3)
            int r0 = r6.f25724d
            r4 = 2
            int r0 = r0 - r4
            r6.m13437i(r0, r2, r7, r4)
            int r0 = r6.f25724d
            int r0 = r0 - r3
            r6.m13437i(r0, r2, r7, r1)
            int r0 = r6.f25725e
            int r0 = r0 - r4
            r5 = 4
            r6.m13437i(r2, r0, r7, r5)
            int r0 = r6.f25725e
            int r0 = r0 - r3
            r5 = 5
            r6.m13437i(r2, r0, r7, r5)
            int r0 = r6.f25725e
            int r0 = r0 - r3
            r2 = 6
            r6.m13437i(r3, r0, r7, r2)
            int r0 = r6.f25725e
            int r0 = r0 - r3
            r2 = 7
            r6.m13437i(r4, r0, r7, r2)
            int r0 = r6.f25725e
            int r0 = r0 - r3
            r2 = 8
            r6.m13437i(r1, r0, r7, r2)
            return
    }

    /* renamed from: f */
    public void m13434f(int r7) {
            r6 = this;
            int r0 = r6.f25724d
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r6.m13437i(r0, r2, r7, r1)
            int r0 = r6.f25724d
            int r0 = r0 - r1
            int r3 = r6.f25725e
            int r3 = r3 - r1
            r4 = 2
            r6.m13437i(r0, r3, r7, r4)
            int r0 = r6.f25725e
            r3 = 3
            int r0 = r0 - r3
            r6.m13437i(r2, r0, r7, r3)
            int r0 = r6.f25725e
            int r0 = r0 - r4
            r5 = 4
            r6.m13437i(r2, r0, r7, r5)
            int r0 = r6.f25725e
            int r0 = r0 - r1
            r5 = 5
            r6.m13437i(r2, r0, r7, r5)
            int r0 = r6.f25725e
            int r0 = r0 - r3
            r2 = 6
            r6.m13437i(r1, r0, r7, r2)
            int r0 = r6.f25725e
            int r0 = r0 - r4
            r2 = 7
            r6.m13437i(r1, r0, r7, r2)
            int r0 = r6.f25725e
            int r0 = r0 - r1
            r2 = 8
            r6.m13437i(r1, r0, r7, r2)
            return
    }

    /* renamed from: g */
    public void m13435g() {
            r6 = this;
            V[] r0 = r6.f25723c
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r0 = r0.length
            int r1 = r6.f25725e
            if (r1 >= r0) goto La
            return
        La:
            int r1 = r0 * 2
            long[] r2 = new long[r1]
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r3 = r6.f25724d
            int r0 = r0 - r3
            java.lang.Object r4 = r6.f25722b
            long[] r4 = (long[]) r4
            r5 = 0
            java.lang.System.arraycopy(r4, r3, r2, r5, r0)
            V[] r3 = r6.f25723c
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            int r4 = r6.f25724d
            java.lang.System.arraycopy(r3, r4, r1, r5, r0)
            int r3 = r6.f25724d
            if (r3 <= 0) goto L38
            java.lang.Object r4 = r6.f25722b
            long[] r4 = (long[]) r4
            java.lang.System.arraycopy(r4, r5, r2, r0, r3)
            V[] r3 = r6.f25723c
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            int r4 = r6.f25724d
            java.lang.System.arraycopy(r3, r5, r1, r0, r4)
        L38:
            r6.f25722b = r2
            r6.f25723c = r1
            r6.f25724d = r5
            return
    }

    /* renamed from: h */
    public boolean m13436h(int r3, int r4) {
            r2 = this;
            V[] r0 = r2.f25723c
            byte[] r0 = (byte[]) r0
            int r1 = r2.f25725e
            int r4 = r4 * r1
            int r4 = r4 + r3
            r3 = r0[r4]
            if (r3 < 0) goto Lf
            r3 = 1
            return r3
        Lf:
            r3 = 0
            return r3
    }

    /* renamed from: i */
    public void m13437i(int r2, int r3, int r4, int r5) {
            r1 = this;
            if (r2 >= 0) goto Lc
            int r0 = r1.f25724d
            int r2 = r2 + r0
            int r0 = r0 + 4
            int r0 = r0 % 8
            int r0 = 4 - r0
            int r3 = r3 + r0
        Lc:
            if (r3 >= 0) goto L18
            int r0 = r1.f25725e
            int r3 = r3 + r0
            int r0 = r0 + 4
            int r0 = r0 % 8
            int r0 = 4 - r0
            int r2 = r2 + r0
        L18:
            java.lang.Object r0 = r1.f25722b
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            char r4 = r0.charAt(r4)
            int r5 = 8 - r5
            r0 = 1
            int r5 = r0 << r5
            r4 = r4 & r5
            if (r4 == 0) goto L29
            goto L2a
        L29:
            r0 = 0
        L2a:
            r1.m13441m(r3, r2, r0)
            return
    }

    /* renamed from: j */
    public V m13438j(long r9, boolean r11) {
            r8 = this;
            r0 = 0
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L6:
            int r3 = r8.f25725e
            if (r3 <= 0) goto L28
            java.lang.Object r3 = r8.f25722b
            long[] r3 = (long[]) r3
            int r4 = r8.f25724d
            r4 = r3[r4]
            long r3 = r9 - r4
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L22
            if (r11 != 0) goto L28
            long r5 = -r3
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 < 0) goto L22
            goto L28
        L22:
            java.lang.Object r0 = r8.m13440l()
            r1 = r3
            goto L6
        L28:
            return r0
    }

    /* renamed from: k */
    public synchronized V m13439k(long r2) {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            java.lang.Object r2 = r1.m13438j(r2, r0)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return r2
        L8:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    /* renamed from: l */
    public V m13440l() {
            r6 = this;
            int r0 = r6.f25725e
            r1 = 1
            if (r0 <= 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            p371v5.C6549a.m13291e(r0)
            V[] r0 = r6.f25723c
            r2 = r0
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            int r3 = r6.f25724d
            r2 = r2[r3]
            r4 = r0
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r5 = 0
            r4[r3] = r5
            int r3 = r3 + r1
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r0 = r0.length
            int r3 = r3 % r0
            r6.f25724d = r3
            int r0 = r6.f25725e
            int r0 = r0 - r1
            r6.f25725e = r0
            return r2
    }

    /* renamed from: m */
    public void m13441m(int r3, int r4, boolean r5) {
            r2 = this;
            V[] r0 = r2.f25723c
            byte[] r0 = (byte[]) r0
            int r1 = r2.f25725e
            int r4 = r4 * r1
            int r4 = r4 + r3
            byte r3 = (byte) r5
            r0[r4] = r3
            return
    }

    /* renamed from: n */
    public void m13442n(int r5, int r6, int r7) {
            r4 = this;
            int r0 = r5 + (-2)
            int r1 = r6 + (-2)
            r2 = 1
            r4.m13437i(r0, r1, r7, r2)
            int r2 = r6 + (-1)
            r3 = 2
            r4.m13437i(r0, r2, r7, r3)
            int r0 = r5 + (-1)
            r3 = 3
            r4.m13437i(r0, r1, r7, r3)
            r3 = 4
            r4.m13437i(r0, r2, r7, r3)
            r3 = 5
            r4.m13437i(r0, r6, r7, r3)
            r0 = 6
            r4.m13437i(r5, r1, r7, r0)
            r0 = 7
            r4.m13437i(r5, r2, r7, r0)
            r0 = 8
            r4.m13437i(r5, r6, r7, r0)
            return
    }
}
