package com.google.android.material.bottomnavigation;

/* loaded from: classes.dex */
public class BottomNavigationView extends p235n8.AbstractC4698e {

    @java.lang.Deprecated
    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$a */
    public interface InterfaceC1126a extends p235n8.AbstractC4698e.b {
    }

    @java.lang.Deprecated
    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$b */
    public interface InterfaceC1127b extends p235n8.AbstractC4698e.c {
    }

    public BottomNavigationView(android.content.Context r9, android.util.AttributeSet r10) {
            r8 = this;
            r0 = 2132017888(0x7f1402e0, float:1.9674067E38)
            r1 = 2130968680(0x7f040068, float:1.754602E38)
            r8.<init>(r9, r10, r1, r0)
            android.content.Context r2 = r8.getContext()
            int[] r4 = p339t7.C6183a.f24008e
            r9 = 0
            int[] r7 = new int[r9]
            r6 = 2132017888(0x7f1402e0, float:1.9674067E38)
            r5 = 2130968680(0x7f040068, float:1.754602E38)
            r3 = r10
            androidx.appcompat.widget.y0 r10 = p220m8.C4429m.m9882e(r2, r3, r4, r5, r6, r7)
            r0 = 1
            boolean r9 = r10.m849a(r9, r0)
            r8.m3277x8985bbc9(r9)
            android.content.res.TypedArray r9 = r10.f1501b
            r9.recycle()
            return
    }

    @Override // p235n8.AbstractC4698e
    public int getMaxItemCount() {
            r1 = this;
            r0 = 5
            return r0
    }

    /* renamed from: setItemHorizontalTranslationEnabled */
    public void m3277x8985bbc9(boolean r3) {
            r2 = this;
            androidx.appcompat.view.menu.j r0 = r2.getMenuView()
            z7.b r0 = (p450z7.C7256b) r0
            boolean r1 = r0.f27856A0
            if (r1 == r3) goto L15
            r0.m14338x8985bbc9(r3)
            n8.d r3 = r2.getPresenter()
            r0 = 0
            r3.mo487v(r0)
        L15:
            return
    }

    @java.lang.Deprecated
    /* renamed from: setOnNavigationItemReselectedListener */
    public void m3278xc376f64a(com.google.android.material.bottomnavigation.BottomNavigationView.InterfaceC1126a r1) {
            r0 = this;
            r0.setOnItemReselectedListener(r1)
            return
    }

    @java.lang.Deprecated
    /* renamed from: setOnNavigationItemSelectedListener */
    public void m3279x1806f817(com.google.android.material.bottomnavigation.BottomNavigationView.InterfaceC1127b r1) {
            r0 = this;
            r0.setOnItemSelectedListener(r1)
            return
    }
}
