package com.google.android.material.tabs;

/* renamed from: com.google.android.material.tabs.c */
/* loaded from: classes.dex */
public final class C1208c {

    /* renamed from: a */
    public final com.google.android.material.tabs.TabLayout f6343a;

    /* renamed from: b */
    public final androidx.viewpager2.widget.ViewPager2 f6344b;

    /* renamed from: c */
    public final com.google.android.material.tabs.C1208c.b f6345c;

    /* renamed from: d */
    public androidx.recyclerview.widget.RecyclerView.AbstractC0549e<?> f6346d;

    /* renamed from: e */
    public boolean f6347e;

    /* renamed from: f */
    public com.google.android.material.tabs.TabLayout.InterfaceC1200d f6348f;

    /* renamed from: com.google.android.material.tabs.c$a */
    public class a extends androidx.recyclerview.widget.RecyclerView.AbstractC0551g {

        /* renamed from: a */
        public final /* synthetic */ com.google.android.material.tabs.C1208c f6349a;

        public a(com.google.android.material.tabs.C1208c r1) {
                r0 = this;
                r0.f6349a = r1
                r0.<init>()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0551g
        /* renamed from: a */
        public void mo1819a() {
                r1 = this;
                com.google.android.material.tabs.c r0 = r1.f6349a
                r0.m3540b()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0551g
        /* renamed from: b */
        public void mo1820b(int r1, int r2) {
                r0 = this;
                com.google.android.material.tabs.c r1 = r0.f6349a
                r1.m3540b()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0551g
        /* renamed from: c */
        public void mo1821c(int r1, int r2, java.lang.Object r3) {
                r0 = this;
                com.google.android.material.tabs.c r1 = r0.f6349a
                r1.m3540b()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0551g
        /* renamed from: d */
        public void mo1822d(int r1, int r2) {
                r0 = this;
                com.google.android.material.tabs.c r1 = r0.f6349a
                r1.m3540b()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0551g
        /* renamed from: e */
        public void mo1823e(int r1, int r2, int r3) {
                r0 = this;
                com.google.android.material.tabs.c r1 = r0.f6349a
                r1.m3540b()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0551g
        /* renamed from: f */
        public void mo1824f(int r1, int r2) {
                r0 = this;
                com.google.android.material.tabs.c r1 = r0.f6349a
                r1.m3540b()
                return
        }
    }

    /* renamed from: com.google.android.material.tabs.c$b */
    public interface b {
        /* renamed from: e */
        void mo2146e(com.google.android.material.tabs.TabLayout.C1202f r1, int r2);
    }

    /* renamed from: com.google.android.material.tabs.c$c */
    public static class c extends androidx.viewpager2.widget.ViewPager2.AbstractC0639e {

        /* renamed from: a */
        public final java.lang.ref.WeakReference<com.google.android.material.tabs.TabLayout> f6350a;

        /* renamed from: b */
        public int f6351b;

        /* renamed from: c */
        public int f6352c;

        public c(com.google.android.material.tabs.TabLayout r2) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.f6350a = r0
                r2 = 0
                r1.f6352c = r2
                r1.f6351b = r2
                return
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0639e
        /* renamed from: a */
        public void mo2184a(int r2) {
                r1 = this;
                int r0 = r1.f6352c
                r1.f6351b = r0
                r1.f6352c = r2
                return
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0639e
        /* renamed from: b */
        public void mo2185b(int r6, float r7, int r8) {
                r5 = this;
                java.lang.ref.WeakReference<com.google.android.material.tabs.TabLayout> r8 = r5.f6350a
                java.lang.Object r8 = r8.get()
                com.google.android.material.tabs.TabLayout r8 = (com.google.android.material.tabs.TabLayout) r8
                if (r8 == 0) goto L23
                int r0 = r5.f6352c
                r1 = 0
                r2 = 2
                r3 = 1
                if (r0 != r2) goto L18
                int r4 = r5.f6351b
                if (r4 != r3) goto L16
                goto L18
            L16:
                r4 = 0
                goto L19
            L18:
                r4 = 1
            L19:
                if (r0 != r2) goto L1f
                int r0 = r5.f6351b
                if (r0 == 0) goto L20
            L1f:
                r1 = 1
            L20:
                r8.m3510k(r6, r7, r4, r1)
            L23:
                return
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0639e
        /* renamed from: c */
        public void mo2186c(int r4) {
                r3 = this;
                java.lang.ref.WeakReference<com.google.android.material.tabs.TabLayout> r0 = r3.f6350a
                java.lang.Object r0 = r0.get()
                com.google.android.material.tabs.TabLayout r0 = (com.google.android.material.tabs.TabLayout) r0
                if (r0 == 0) goto L2c
                int r1 = r0.getSelectedTabPosition()
                if (r1 == r4) goto L2c
                int r1 = r0.getTabCount()
                if (r4 >= r1) goto L2c
                int r1 = r3.f6352c
                if (r1 == 0) goto L24
                r2 = 2
                if (r1 != r2) goto L22
                int r1 = r3.f6351b
                if (r1 != 0) goto L22
                goto L24
            L22:
                r1 = 0
                goto L25
            L24:
                r1 = 1
            L25:
                com.google.android.material.tabs.TabLayout$f r4 = r0.m3506g(r4)
                r0.m3509j(r4, r1)
            L2c:
                return
        }
    }

    /* renamed from: com.google.android.material.tabs.c$d */
    public static class d implements com.google.android.material.tabs.TabLayout.InterfaceC1200d {

        /* renamed from: a */
        public final androidx.viewpager2.widget.ViewPager2 f6353a;

        /* renamed from: b */
        public final boolean f6354b;

        public d(androidx.viewpager2.widget.ViewPager2 r1, boolean r2) {
                r0 = this;
                r0.<init>()
                r0.f6353a = r1
                r0.f6354b = r2
                return
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC1199c
        /* renamed from: a */
        public void mo3516a(com.google.android.material.tabs.TabLayout.C1202f r1) {
                r0 = this;
                return
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC1199c
        /* renamed from: b */
        public void mo3517b(com.google.android.material.tabs.TabLayout.C1202f r1) {
                r0 = this;
                return
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC1199c
        /* renamed from: c */
        public void mo3518c(com.google.android.material.tabs.TabLayout.C1202f r3) {
                r2 = this;
                androidx.viewpager2.widget.ViewPager2 r0 = r2.f6353a
                int r3 = r3.f6320d
                boolean r1 = r2.f6354b
                r0.m2179c(r3, r1)
                return
        }
    }

    public C1208c(com.google.android.material.tabs.TabLayout r1, androidx.viewpager2.widget.ViewPager2 r2, com.google.android.material.tabs.C1208c.b r3) {
            r0 = this;
            r0.<init>()
            r0.f6343a = r1
            r0.f6344b = r2
            r0.f6345c = r3
            return
    }

    /* renamed from: a */
    public void m3539a() {
            r4 = this;
            boolean r0 = r4.f6347e
            if (r0 != 0) goto L5d
            androidx.viewpager2.widget.ViewPager2 r0 = r4.f6344b
            androidx.recyclerview.widget.RecyclerView$e r0 = r0.getAdapter()
            r4.f6346d = r0
            if (r0 == 0) goto L55
            r0 = 1
            r4.f6347e = r0
            com.google.android.material.tabs.c$c r1 = new com.google.android.material.tabs.c$c
            com.google.android.material.tabs.TabLayout r2 = r4.f6343a
            r1.<init>(r2)
            androidx.viewpager2.widget.ViewPager2 r2 = r4.f6344b
            androidx.viewpager2.widget.a r2 = r2.f3735c0
            java.util.List<androidx.viewpager2.widget.ViewPager2$e> r2 = r2.f3769a
            r2.add(r1)
            com.google.android.material.tabs.c$d r1 = new com.google.android.material.tabs.c$d
            androidx.viewpager2.widget.ViewPager2 r2 = r4.f6344b
            r1.<init>(r2, r0)
            r4.f6348f = r1
            com.google.android.material.tabs.TabLayout r2 = r4.f6343a
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$c> r3 = r2.f6271G0
            boolean r3 = r3.contains(r1)
            if (r3 != 0) goto L39
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$c> r2 = r2.f6271G0
            r2.add(r1)
        L39:
            com.google.android.material.tabs.c$a r1 = new com.google.android.material.tabs.c$a
            r1.<init>(r4)
            androidx.recyclerview.widget.RecyclerView$e<?> r2 = r4.f6346d
            androidx.recyclerview.widget.RecyclerView$f r2 = r2.f3228a
            r2.registerObserver(r1)
            r4.m3540b()
            com.google.android.material.tabs.TabLayout r1 = r4.f6343a
            androidx.viewpager2.widget.ViewPager2 r2 = r4.f6344b
            int r2 = r2.getCurrentItem()
            r3 = 0
            r1.m3510k(r2, r3, r0, r0)
            return
        L55:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "TabLayoutMediator attached before ViewPager2 has an adapter"
            r0.<init>(r1)
            throw r0
        L5d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "TabLayoutMediator is already attached"
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: b */
    public void m3540b() {
            r5 = this;
            com.google.android.material.tabs.TabLayout r0 = r5.f6343a
            r0.m3508i()
            androidx.recyclerview.widget.RecyclerView$e<?> r0 = r5.f6346d
            if (r0 == 0) goto L49
            int r0 = r0.mo1521b()
            r1 = 0
            r2 = 0
        Lf:
            if (r2 >= r0) goto L24
            com.google.android.material.tabs.TabLayout r3 = r5.f6343a
            com.google.android.material.tabs.TabLayout$f r3 = r3.m3507h()
            com.google.android.material.tabs.c$b r4 = r5.f6345c
            r4.mo2146e(r3, r2)
            com.google.android.material.tabs.TabLayout r4 = r5.f6343a
            r4.m3500a(r3, r1)
            int r2 = r2 + 1
            goto Lf
        L24:
            if (r0 <= 0) goto L49
            com.google.android.material.tabs.TabLayout r0 = r5.f6343a
            int r0 = r0.getTabCount()
            r1 = 1
            int r0 = r0 - r1
            androidx.viewpager2.widget.ViewPager2 r2 = r5.f6344b
            int r2 = r2.getCurrentItem()
            int r0 = java.lang.Math.min(r2, r0)
            com.google.android.material.tabs.TabLayout r2 = r5.f6343a
            int r2 = r2.getSelectedTabPosition()
            if (r0 == r2) goto L49
            com.google.android.material.tabs.TabLayout r2 = r5.f6343a
            com.google.android.material.tabs.TabLayout$f r0 = r2.m3506g(r0)
            r2.m3509j(r0, r1)
        L49:
            return
    }
}
