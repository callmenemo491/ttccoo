package com.google.android.material.datepicker;

/* renamed from: com.google.android.material.datepicker.f */
/* loaded from: classes.dex */
public final class C1161f<S> extends com.google.android.material.datepicker.AbstractC1178w<S> {

    /* renamed from: f1 */
    public static final /* synthetic */ int f6068f1 = 0;

    /* renamed from: V0 */
    public int f6069V0;

    /* renamed from: W0 */
    public com.google.android.material.datepicker.InterfaceC1158c<S> f6070W0;

    /* renamed from: X0 */
    public com.google.android.material.datepicker.C1154a f6071X0;

    /* renamed from: Y0 */
    public com.google.android.material.datepicker.C1173r f6072Y0;

    /* renamed from: Z0 */
    public int f6073Z0;

    /* renamed from: a1 */
    public p124h7.C2609ef f6074a1;

    /* renamed from: b1 */
    public androidx.recyclerview.widget.RecyclerView f6075b1;

    /* renamed from: c1 */
    public androidx.recyclerview.widget.RecyclerView f6076c1;

    /* renamed from: d1 */
    public android.view.View f6077d1;

    /* renamed from: e1 */
    public android.view.View f6078e1;

    /* renamed from: com.google.android.material.datepicker.f$a */
    public class a implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ int f6079Y;

        /* renamed from: Z */
        public final /* synthetic */ com.google.android.material.datepicker.C1161f f6080Z;

        public a(com.google.android.material.datepicker.C1161f r1, int r2) {
                r0 = this;
                r0.f6080Z = r1
                r0.f6079Y = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                com.google.android.material.datepicker.f r0 = r2.f6080Z
                androidx.recyclerview.widget.RecyclerView r0 = r0.f6076c1
                int r1 = r2.f6079Y
                r0.m1760j0(r1)
                return
        }
    }

    /* renamed from: com.google.android.material.datepicker.f$b */
    public class b extends p227n0.C4641a {
        public b(com.google.android.material.datepicker.C1161f r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p227n0.C4641a
        /* renamed from: d */
        public void mo1040d(android.view.View r3, p242o0.C4868b r4) {
                r2 = this;
                android.view.View$AccessibilityDelegate r0 = r2.f18502a
                android.view.accessibility.AccessibilityNodeInfo r1 = r4.f19337a
                r0.onInitializeAccessibilityNodeInfo(r3, r1)
                r3 = 0
                r4.m10996i(r3)
                return
        }
    }

    /* renamed from: com.google.android.material.datepicker.f$c */
    public class c extends com.google.android.material.datepicker.C1179x {

        /* renamed from: E */
        public final /* synthetic */ int f6081E;

        /* renamed from: F */
        public final /* synthetic */ com.google.android.material.datepicker.C1161f f6082F;

        public c(com.google.android.material.datepicker.C1161f r1, android.content.Context r2, int r3, boolean r4, int r5) {
                r0 = this;
                r0.f6082F = r1
                r0.f6081E = r5
                r0.<init>(r2, r3, r4)
                return
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        /* renamed from: N0 */
        public void mo1664N0(androidx.recyclerview.widget.RecyclerView.C0569y r3, int[] r4) {
                r2 = this;
                int r3 = r2.f6081E
                r0 = 1
                r1 = 0
                if (r3 != 0) goto L1b
                com.google.android.material.datepicker.f r3 = r2.f6082F
                androidx.recyclerview.widget.RecyclerView r3 = r3.f6076c1
                int r3 = r3.getWidth()
                r4[r1] = r3
                com.google.android.material.datepicker.f r3 = r2.f6082F
                androidx.recyclerview.widget.RecyclerView r3 = r3.f6076c1
                int r3 = r3.getWidth()
                r4[r0] = r3
                goto L2f
            L1b:
                com.google.android.material.datepicker.f r3 = r2.f6082F
                androidx.recyclerview.widget.RecyclerView r3 = r3.f6076c1
                int r3 = r3.getHeight()
                r4[r1] = r3
                com.google.android.material.datepicker.f r3 = r2.f6082F
                androidx.recyclerview.widget.RecyclerView r3 = r3.f6076c1
                int r3 = r3.getHeight()
                r4[r0] = r3
            L2f:
                return
        }
    }

    /* renamed from: com.google.android.material.datepicker.f$d */
    public class d implements com.google.android.material.datepicker.C1161f.e {

        /* renamed from: a */
        public final /* synthetic */ com.google.android.material.datepicker.C1161f f6083a;

        public d(com.google.android.material.datepicker.C1161f r1) {
                r0 = this;
                r0.f6083a = r1
                r0.<init>()
                return
        }
    }

    /* renamed from: com.google.android.material.datepicker.f$e */
    public interface e {
    }

    public C1161f() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.material.datepicker.AbstractC1178w
    /* renamed from: D0 */
    public boolean mo3412D0(com.google.android.material.datepicker.AbstractC1177v<S> r2) {
            r1 = this;
            java.util.LinkedHashSet<com.google.android.material.datepicker.v<S>> r0 = r1.f6144U0
            boolean r2 = r0.add(r2)
            return r2
    }

    /* renamed from: E0 */
    public androidx.recyclerview.widget.LinearLayoutManager m3413E0() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r1.f6076c1
            androidx.recyclerview.widget.RecyclerView$m r0 = r0.getLayoutManager()
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            return r0
    }

    /* renamed from: F0 */
    public final void m3414F0(int r3) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r2.f6076c1
            com.google.android.material.datepicker.f$a r1 = new com.google.android.material.datepicker.f$a
            r1.<init>(r2, r3)
            r0.post(r1)
            return
    }

    /* renamed from: G0 */
    public void m3415G0(com.google.android.material.datepicker.C1173r r7) {
            r6 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r6.f6076c1
            androidx.recyclerview.widget.RecyclerView$e r0 = r0.getAdapter()
            com.google.android.material.datepicker.u r0 = (com.google.android.material.datepicker.C1176u) r0
            com.google.android.material.datepicker.a r1 = r0.f6138e
            com.google.android.material.datepicker.r r1 = r1.f6041Y
            int r1 = r1.m3431r(r7)
            com.google.android.material.datepicker.r r2 = r6.f6072Y0
            int r0 = r0.m3439j(r2)
            int r0 = r1 - r0
            int r2 = java.lang.Math.abs(r0)
            r3 = 1
            r4 = 0
            r5 = 3
            if (r2 <= r5) goto L23
            r2 = 1
            goto L24
        L23:
            r2 = 0
        L24:
            if (r0 <= 0) goto L27
            goto L28
        L27:
            r3 = 0
        L28:
            r6.f6072Y0 = r7
            if (r2 == 0) goto L33
            if (r3 == 0) goto L33
            androidx.recyclerview.widget.RecyclerView r7 = r6.f6076c1
            int r0 = r1 + (-3)
            goto L39
        L33:
            if (r2 == 0) goto L3c
            androidx.recyclerview.widget.RecyclerView r7 = r6.f6076c1
            int r0 = r1 + 3
        L39:
            r7.m1755g0(r0)
        L3c:
            r6.m3414F0(r1)
            return
    }

    /* renamed from: H0 */
    public void m3416H0(int r5) {
            r4 = this;
            r4.f6073Z0 = r5
            r0 = 2
            r1 = 8
            r2 = 0
            if (r5 != r0) goto L2c
            androidx.recyclerview.widget.RecyclerView r5 = r4.f6075b1
            androidx.recyclerview.widget.RecyclerView$m r5 = r5.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r0 = r4.f6075b1
            androidx.recyclerview.widget.RecyclerView$e r0 = r0.getAdapter()
            com.google.android.material.datepicker.b0 r0 = (com.google.android.material.datepicker.C1157b0) r0
            com.google.android.material.datepicker.r r3 = r4.f6072Y0
            int r3 = r3.f6124a0
            int r0 = r0.m3403i(r3)
            r5.mo1661A0(r0)
            android.view.View r5 = r4.f6077d1
            r5.setVisibility(r2)
            android.view.View r5 = r4.f6078e1
            r5.setVisibility(r1)
            goto L3e
        L2c:
            r0 = 1
            if (r5 != r0) goto L3e
            android.view.View r5 = r4.f6077d1
            r5.setVisibility(r1)
            android.view.View r5 = r4.f6078e1
            r5.setVisibility(r2)
            com.google.android.material.datepicker.r r5 = r4.f6072Y0
            r4.m3415G0(r5)
        L3e:
            return
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: V */
    public void mo114V(android.os.Bundle r2) {
            r1 = this;
            super.mo114V(r2)
            if (r2 != 0) goto L7
            android.os.Bundle r2 = r1.f2282d0
        L7:
            java.lang.String r0 = "THEME_RES_ID_KEY"
            int r0 = r2.getInt(r0)
            r1.f6069V0 = r0
            java.lang.String r0 = "GRID_SELECTOR_KEY"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            com.google.android.material.datepicker.c r0 = (com.google.android.material.datepicker.InterfaceC1158c) r0
            r1.f6070W0 = r0
            java.lang.String r0 = "CALENDAR_CONSTRAINTS_KEY"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            com.google.android.material.datepicker.a r0 = (com.google.android.material.datepicker.C1154a) r0
            r1.f6071X0 = r0
            java.lang.String r0 = "CURRENT_MONTH_KEY"
            android.os.Parcelable r2 = r2.getParcelable(r0)
            com.google.android.material.datepicker.r r2 = (com.google.android.material.datepicker.C1173r) r2
            r1.f6072Y0 = r2
            return
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: W */
    public android.view.View mo1317W(android.view.LayoutInflater r11, android.view.ViewGroup r12, android.os.Bundle r13) {
            r10 = this;
            android.view.ContextThemeWrapper r13 = new android.view.ContextThemeWrapper
            android.content.Context r0 = r10.m1339v()
            int r1 = r10.f6069V0
            r13.<init>(r0, r1)
            h7.ef r0 = new h7.ef
            r0.<init>(r13)
            r10.f6074a1 = r0
            android.view.LayoutInflater r11 = r11.cloneInContext(r13)
            com.google.android.material.datepicker.a r0 = r10.f6071X0
            com.google.android.material.datepicker.r r0 = r0.f6041Y
            boolean r1 = com.google.android.material.datepicker.C1169n.m3418M0(r13)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L27
            r1 = 2131558535(0x7f0d0087, float:1.8742389E38)
            r9 = 1
            goto L2b
        L27:
            r1 = 2131558530(0x7f0d0082, float:1.8742378E38)
            r9 = 0
        L2b:
            android.view.View r11 = r11.inflate(r1, r12, r2)
            r12 = 2131362416(0x7f0a0270, float:1.8344612E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.GridView r12 = (android.widget.GridView) r12
            com.google.android.material.datepicker.f$b r1 = new com.google.android.material.datepicker.f$b
            r1.<init>(r10)
            p227n0.C4661t.m10546v(r12, r1)
            com.google.android.material.datepicker.e r1 = new com.google.android.material.datepicker.e
            r1.<init>()
            r12.setAdapter(r1)
            int r0 = r0.f6125b0
            r12.setNumColumns(r0)
            r12.setEnabled(r2)
            r12 = 2131362419(0x7f0a0273, float:1.8344618E38)
            android.view.View r12 = r11.findViewById(r12)
            androidx.recyclerview.widget.RecyclerView r12 = (androidx.recyclerview.widget.RecyclerView) r12
            r10.f6076c1 = r12
            com.google.android.material.datepicker.f$c r12 = new com.google.android.material.datepicker.f$c
            android.content.Context r6 = r10.m1339v()
            r8 = 0
            r4 = r12
            r5 = r10
            r7 = r9
            r4.<init>(r5, r6, r7, r8, r9)
            androidx.recyclerview.widget.RecyclerView r0 = r10.f6076c1
            r0.setLayoutManager(r12)
            androidx.recyclerview.widget.RecyclerView r12 = r10.f6076c1
            java.lang.String r0 = "MONTHS_VIEW_GROUP_TAG"
            r12.setTag(r0)
            com.google.android.material.datepicker.u r12 = new com.google.android.material.datepicker.u
            com.google.android.material.datepicker.c<S> r0 = r10.f6070W0
            com.google.android.material.datepicker.a r1 = r10.f6071X0
            com.google.android.material.datepicker.f$d r4 = new com.google.android.material.datepicker.f$d
            r4.<init>(r10)
            r12.<init>(r13, r0, r1, r4)
            androidx.recyclerview.widget.RecyclerView r0 = r10.f6076c1
            r0.setAdapter(r12)
            android.content.res.Resources r0 = r13.getResources()
            r1 = 2131427362(0x7f0b0022, float:1.8476338E38)
            int r0 = r0.getInteger(r1)
            r1 = 2131362422(0x7f0a0276, float:1.8344624E38)
            android.view.View r4 = r11.findViewById(r1)
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            r10.f6075b1 = r4
            if (r4 == 0) goto Lc0
            r4.setHasFixedSize(r3)
            androidx.recyclerview.widget.RecyclerView r4 = r10.f6075b1
            androidx.recyclerview.widget.GridLayoutManager r5 = new androidx.recyclerview.widget.GridLayoutManager
            r5.<init>(r13, r0, r3, r2)
            r4.setLayoutManager(r5)
            androidx.recyclerview.widget.RecyclerView r0 = r10.f6075b1
            com.google.android.material.datepicker.b0 r2 = new com.google.android.material.datepicker.b0
            r2.<init>(r10)
            r0.setAdapter(r2)
            androidx.recyclerview.widget.RecyclerView r0 = r10.f6075b1
            com.google.android.material.datepicker.g r2 = new com.google.android.material.datepicker.g
            r2.<init>(r10)
            r0.m1754g(r2)
        Lc0:
            r0 = 2131362354(0x7f0a0232, float:1.8344486E38)
            android.view.View r2 = r11.findViewById(r0)
            if (r2 == 0) goto L139
            android.view.View r0 = r11.findViewById(r0)
            com.google.android.material.button.MaterialButton r0 = (com.google.android.material.button.MaterialButton) r0
            java.lang.String r2 = "SELECTOR_TOGGLE_TAG"
            r0.setTag(r2)
            com.google.android.material.datepicker.h r2 = new com.google.android.material.datepicker.h
            r2.<init>(r10)
            p227n0.C4661t.m10546v(r0, r2)
            r2 = 2131362356(0x7f0a0234, float:1.834449E38)
            android.view.View r2 = r11.findViewById(r2)
            com.google.android.material.button.MaterialButton r2 = (com.google.android.material.button.MaterialButton) r2
            java.lang.String r4 = "NAVIGATION_PREV_TAG"
            r2.setTag(r4)
            r4 = 2131362355(0x7f0a0233, float:1.8344488E38)
            android.view.View r4 = r11.findViewById(r4)
            com.google.android.material.button.MaterialButton r4 = (com.google.android.material.button.MaterialButton) r4
            java.lang.String r5 = "NAVIGATION_NEXT_TAG"
            r4.setTag(r5)
            android.view.View r1 = r11.findViewById(r1)
            r10.f6077d1 = r1
            r1 = 2131362415(0x7f0a026f, float:1.834461E38)
            android.view.View r1 = r11.findViewById(r1)
            r10.f6078e1 = r1
            r10.m3416H0(r3)
            com.google.android.material.datepicker.r r1 = r10.f6072Y0
            android.content.Context r3 = r11.getContext()
            java.lang.String r1 = r1.m3429l(r3)
            r0.setText(r1)
            androidx.recyclerview.widget.RecyclerView r1 = r10.f6076c1
            com.google.android.material.datepicker.i r3 = new com.google.android.material.datepicker.i
            r3.<init>(r10, r12, r0)
            r1.m1756h(r3)
            com.google.android.material.datepicker.j r1 = new com.google.android.material.datepicker.j
            r1.<init>(r10)
            r0.setOnClickListener(r1)
            com.google.android.material.datepicker.k r0 = new com.google.android.material.datepicker.k
            r0.<init>(r10, r12)
            r4.setOnClickListener(r0)
            com.google.android.material.datepicker.l r0 = new com.google.android.material.datepicker.l
            r0.<init>(r10, r12)
            r2.setOnClickListener(r0)
        L139:
            boolean r13 = com.google.android.material.datepicker.C1169n.m3418M0(r13)
            if (r13 != 0) goto L149
            androidx.recyclerview.widget.e0 r13 = new androidx.recyclerview.widget.e0
            r13.<init>()
            androidx.recyclerview.widget.RecyclerView r0 = r10.f6076c1
            r13.m2081a(r0)
        L149:
            androidx.recyclerview.widget.RecyclerView r13 = r10.f6076c1
            com.google.android.material.datepicker.r r0 = r10.f6072Y0
            int r12 = r12.m3439j(r0)
            r13.m1755g0(r12)
            return r11
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: f0 */
    public void mo1234f0(android.os.Bundle r3) {
            r2 = this;
            int r0 = r2.f6069V0
            java.lang.String r1 = "THEME_RES_ID_KEY"
            r3.putInt(r1, r0)
            com.google.android.material.datepicker.c<S> r0 = r2.f6070W0
            java.lang.String r1 = "GRID_SELECTOR_KEY"
            r3.putParcelable(r1, r0)
            com.google.android.material.datepicker.a r0 = r2.f6071X0
            java.lang.String r1 = "CALENDAR_CONSTRAINTS_KEY"
            r3.putParcelable(r1, r0)
            com.google.android.material.datepicker.r r0 = r2.f6072Y0
            java.lang.String r1 = "CURRENT_MONTH_KEY"
            r3.putParcelable(r1, r0)
            return
    }
}
