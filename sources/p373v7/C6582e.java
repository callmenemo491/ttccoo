package p373v7;

import android.view.View;

/* renamed from: v7.e */
/* loaded from: classes.dex */
public class C6582e<V extends android.view.View> extends androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c<V> {

    /* renamed from: a */
    public p373v7.C6583f f25748a;

    /* renamed from: b */
    public int f25749b;

    public C6582e() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f25749b = r0
            return
    }

    public C6582e(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.f25749b = r1
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c
    /* renamed from: h */
    public boolean mo992h(androidx.coordinatorlayout.widget.CoordinatorLayout r2, V r3, int r4) {
            r1 = this;
            r1.mo13450t(r2, r3, r4)
            v7.f r2 = r1.f25748a
            if (r2 != 0) goto Le
            v7.f r2 = new v7.f
            r2.<init>(r3)
            r1.f25748a = r2
        Le:
            v7.f r2 = r1.f25748a
            android.view.View r3 = r2.f25750a
            int r3 = r3.getTop()
            r2.f25751b = r3
            android.view.View r3 = r2.f25750a
            int r3 = r3.getLeft()
            r2.f25752c = r3
            v7.f r2 = r1.f25748a
            r2.m13454a()
            int r2 = r1.f25749b
            r3 = 0
            if (r2 == 0) goto L37
            v7.f r4 = r1.f25748a
            int r0 = r4.f25753d
            if (r0 == r2) goto L35
            r4.f25753d = r2
            r4.m13454a()
        L35:
            r1.f25749b = r3
        L37:
            r2 = 1
            return r2
    }

    /* renamed from: s */
    public int m13452s() {
            r1 = this;
            v7.f r0 = r1.f25748a
            if (r0 == 0) goto L7
            int r0 = r0.f25753d
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    /* renamed from: t */
    public void mo13450t(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, int r3) {
            r0 = this;
            r1.m976r(r2, r3)
            return
    }

    /* renamed from: u */
    public boolean m13453u(int r4) {
            r3 = this;
            v7.f r0 = r3.f25748a
            r1 = 0
            if (r0 == 0) goto L10
            int r2 = r0.f25753d
            if (r2 == r4) goto Lf
            r0.f25753d = r4
            r0.m13454a()
            r1 = 1
        Lf:
            return r1
        L10:
            r3.f25749b = r4
            return r1
    }
}
