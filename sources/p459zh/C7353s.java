package p459zh;

import java.lang.Comparable;
import p459zh.InterfaceC7354t;

/* renamed from: zh.s */
/* loaded from: classes.dex */
public class C7353s<T extends p459zh.InterfaceC7354t & java.lang.Comparable<? super T>> {
    private volatile /* synthetic */ int _size;

    /* renamed from: a */
    public T[] f28115a;

    public C7353s() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._size = r0
            return
    }

    /* renamed from: a */
    public final void m14438a(T r5) {
            r4 = this;
            r0 = r5
            vh.p0$b r0 = (p379vh.AbstractC6728p0.b) r0
            r0.mo13658o(r4)
            T extends zh.t & java.lang.Comparable<? super T>[] r1 = r4.f28115a
            if (r1 != 0) goto L10
            r1 = 4
            zh.t[] r1 = new p459zh.InterfaceC7354t[r1]
            r4.f28115a = r1
            goto L26
        L10:
            int r2 = r4._size
            int r3 = r1.length
            if (r2 < r3) goto L26
            int r2 = r4._size
            int r2 = r2 * 2
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            java.lang.String r2 = "java.util.Arrays.copyOf(this, newSize)"
            p214m2.C4339q.m9705j(r1, r2)
            zh.t[] r1 = (p459zh.InterfaceC7354t[]) r1
            r4.f28115a = r1
        L26:
            int r2 = r4._size
            int r3 = r2 + 1
            r4._size = r3
            r1[r2] = r5
            r0.f26022a0 = r2
            r4.m14443f(r2)
            return
    }

    /* renamed from: b */
    public final T m14439b() {
            r2 = this;
            T extends zh.t & java.lang.Comparable<? super T>[] r0 = r2.f28115a
            if (r0 != 0) goto L6
            r0 = 0
            goto L9
        L6:
            r1 = 0
            r0 = r0[r1]
        L9:
            return r0
    }

    /* renamed from: c */
    public final boolean m14440c() {
            r1 = this;
            int r0 = r1._size
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    /* renamed from: d */
    public final T m14441d(int r8) {
            r7 = this;
            T extends zh.t & java.lang.Comparable<? super T>[] r0 = r7.f28115a
            p214m2.C4339q.m9704i(r0)
            int r1 = r7._size
            r2 = -1
            int r1 = r1 + r2
            r7._size = r1
            int r1 = r7._size
            if (r8 >= r1) goto L72
            int r1 = r7._size
            r7.m14444g(r8, r1)
            int r1 = r8 + (-1)
            int r1 = r1 / 2
            if (r8 <= 0) goto L33
            r3 = r0[r8]
            p214m2.C4339q.m9704i(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r0[r1]
            p214m2.C4339q.m9704i(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L33
            r7.m14444g(r8, r1)
            r7.m14443f(r1)
            goto L72
        L33:
            int r1 = r8 * 2
            int r1 = r1 + 1
            int r3 = r7._size
            if (r1 < r3) goto L3c
            goto L72
        L3c:
            T extends zh.t & java.lang.Comparable<? super T>[] r3 = r7.f28115a
            p214m2.C4339q.m9704i(r3)
            int r4 = r1 + 1
            int r5 = r7._size
            if (r4 >= r5) goto L5a
            r5 = r3[r4]
            p214m2.C4339q.m9704i(r5)
            java.lang.Comparable r5 = (java.lang.Comparable) r5
            r6 = r3[r1]
            p214m2.C4339q.m9704i(r6)
            int r5 = r5.compareTo(r6)
            if (r5 >= 0) goto L5a
            r1 = r4
        L5a:
            r4 = r3[r8]
            p214m2.C4339q.m9704i(r4)
            java.lang.Comparable r4 = (java.lang.Comparable) r4
            r3 = r3[r1]
            p214m2.C4339q.m9704i(r3)
            int r3 = r4.compareTo(r3)
            if (r3 > 0) goto L6d
            goto L72
        L6d:
            r7.m14444g(r8, r1)
            r8 = r1
            goto L33
        L72:
            int r8 = r7._size
            r8 = r0[r8]
            p214m2.C4339q.m9704i(r8)
            r1 = 0
            r8.mo13658o(r1)
            r8.mo13656g(r2)
            int r2 = r7._size
            r0[r2] = r1
            return r8
    }

    /* renamed from: e */
    public final T m14442e() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1._size     // Catch: java.lang.Throwable -> Le
            if (r0 <= 0) goto Lb
            r0 = 0
            zh.t r0 = r1.m14441d(r0)     // Catch: java.lang.Throwable -> Le
            goto Lc
        Lb:
            r0 = 0
        Lc:
            monitor-exit(r1)
            return r0
        Le:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    /* renamed from: f */
    public final void m14443f(int r4) {
            r3 = this;
        L0:
            if (r4 > 0) goto L3
            return
        L3:
            T extends zh.t & java.lang.Comparable<? super T>[] r0 = r3.f28115a
            p214m2.C4339q.m9704i(r0)
            int r1 = r4 + (-1)
            int r1 = r1 / 2
            r2 = r0[r1]
            p214m2.C4339q.m9704i(r2)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            r0 = r0[r4]
            p214m2.C4339q.m9704i(r0)
            int r0 = r2.compareTo(r0)
            if (r0 > 0) goto L1f
            return
        L1f:
            r3.m14444g(r4, r1)
            r4 = r1
            goto L0
    }

    /* renamed from: g */
    public final void m14444g(int r4, int r5) {
            r3 = this;
            T extends zh.t & java.lang.Comparable<? super T>[] r0 = r3.f28115a
            p214m2.C4339q.m9704i(r0)
            r1 = r0[r5]
            p214m2.C4339q.m9704i(r1)
            r2 = r0[r4]
            p214m2.C4339q.m9704i(r2)
            r0[r4] = r1
            r0[r5] = r2
            r1.mo13656g(r4)
            r2.mo13656g(r5)
            return
    }
}
