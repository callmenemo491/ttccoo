package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.f */
/* loaded from: classes.dex */
public class C0587f implements androidx.recyclerview.widget.InterfaceC0614y {

    /* renamed from: a */
    public final androidx.recyclerview.widget.InterfaceC0614y f3403a;

    /* renamed from: b */
    public int f3404b;

    /* renamed from: c */
    public int f3405c;

    /* renamed from: d */
    public int f3406d;

    /* renamed from: e */
    public java.lang.Object f3407e;

    public C0587f(androidx.recyclerview.widget.InterfaceC0614y r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f3404b = r0
            r0 = -1
            r1.f3405c = r0
            r1.f3406d = r0
            r0 = 0
            r1.f3407e = r0
            r1.f3403a = r2
            return
    }

    @Override // androidx.recyclerview.widget.InterfaceC0614y
    /* renamed from: a */
    public void mo2011a(int r4, int r5) {
            r3 = this;
            int r0 = r3.f3404b
            r1 = 2
            if (r0 != r1) goto L15
            int r0 = r3.f3405c
            if (r0 < r4) goto L15
            int r2 = r4 + r5
            if (r0 > r2) goto L15
            int r0 = r3.f3406d
            int r0 = r0 + r5
            r3.f3406d = r0
            r3.f3405c = r4
            return
        L15:
            r3.m2032e()
            r3.f3405c = r4
            r3.f3406d = r5
            r3.f3404b = r1
            return
    }

    @Override // androidx.recyclerview.widget.InterfaceC0614y
    /* renamed from: b */
    public void mo2012b(int r2, int r3) {
            r1 = this;
            r1.m2032e()
            androidx.recyclerview.widget.y r0 = r1.f3403a
            r0.mo2012b(r2, r3)
            return
    }

    @Override // androidx.recyclerview.widget.InterfaceC0614y
    /* renamed from: c */
    public void mo2013c(int r5, int r6) {
            r4 = this;
            int r0 = r4.f3404b
            r1 = 1
            if (r0 != r1) goto L19
            int r0 = r4.f3405c
            if (r5 < r0) goto L19
            int r2 = r4.f3406d
            int r3 = r0 + r2
            if (r5 > r3) goto L19
            int r2 = r2 + r6
            r4.f3406d = r2
            int r5 = java.lang.Math.min(r5, r0)
            r4.f3405c = r5
            return
        L19:
            r4.m2032e()
            r4.f3405c = r5
            r4.f3406d = r6
            r4.f3404b = r1
            return
    }

    @Override // androidx.recyclerview.widget.InterfaceC0614y
    /* renamed from: d */
    public void mo2014d(int r6, int r7, java.lang.Object r8) {
            r5 = this;
            int r0 = r5.f3404b
            r1 = 3
            if (r0 != r1) goto L26
            int r0 = r5.f3405c
            int r2 = r5.f3406d
            int r3 = r0 + r2
            if (r6 > r3) goto L26
            int r3 = r6 + r7
            if (r3 < r0) goto L26
            java.lang.Object r4 = r5.f3407e
            if (r4 != r8) goto L26
            int r2 = r2 + r0
            int r6 = java.lang.Math.min(r6, r0)
            r5.f3405c = r6
            int r6 = java.lang.Math.max(r2, r3)
            int r7 = r5.f3405c
            int r6 = r6 - r7
            r5.f3406d = r6
            return
        L26:
            r5.m2032e()
            r5.f3405c = r6
            r5.f3406d = r7
            r5.f3407e = r8
            r5.f3404b = r1
            return
    }

    /* renamed from: e */
    public void m2032e() {
            r4 = this;
            int r0 = r4.f3404b
            if (r0 != 0) goto L5
            return
        L5:
            r1 = 1
            if (r0 == r1) goto L25
            r1 = 2
            if (r0 == r1) goto L1b
            r1 = 3
            if (r0 == r1) goto Lf
            goto L2e
        Lf:
            androidx.recyclerview.widget.y r0 = r4.f3403a
            int r1 = r4.f3405c
            int r2 = r4.f3406d
            java.lang.Object r3 = r4.f3407e
            r0.mo2014d(r1, r2, r3)
            goto L2e
        L1b:
            androidx.recyclerview.widget.y r0 = r4.f3403a
            int r1 = r4.f3405c
            int r2 = r4.f3406d
            r0.mo2011a(r1, r2)
            goto L2e
        L25:
            androidx.recyclerview.widget.y r0 = r4.f3403a
            int r1 = r4.f3405c
            int r2 = r4.f3406d
            r0.mo2013c(r1, r2)
        L2e:
            r0 = 0
            r4.f3407e = r0
            r0 = 0
            r4.f3404b = r0
            return
    }
}
