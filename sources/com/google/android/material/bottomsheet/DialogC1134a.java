package com.google.android.material.bottomsheet;

/* renamed from: com.google.android.material.bottomsheet.a */
/* loaded from: classes.dex */
public class DialogC1134a extends p083f.DialogC1929p {

    /* renamed from: a0 */
    public com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout> f5882a0;

    /* renamed from: b0 */
    public android.widget.FrameLayout f5883b0;

    /* renamed from: c0 */
    public androidx.coordinatorlayout.widget.CoordinatorLayout f5884c0;

    /* renamed from: d0 */
    public android.widget.FrameLayout f5885d0;

    /* renamed from: e0 */
    public boolean f5886e0;

    /* renamed from: f0 */
    public boolean f5887f0;

    /* renamed from: g0 */
    public boolean f5888g0;

    /* renamed from: h0 */
    public com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC1131d f5889h0;

    /* renamed from: i0 */
    public boolean f5890i0;

    /* renamed from: j0 */
    public com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC1131d f5891j0;

    /* renamed from: com.google.android.material.bottomsheet.a$a */
    public class a implements p227n0.InterfaceC4653l {

        /* renamed from: a */
        public final /* synthetic */ com.google.android.material.bottomsheet.DialogC1134a f5892a;

        public a(com.google.android.material.bottomsheet.DialogC1134a r1) {
                r0 = this;
                r0.f5892a = r1
                r0.<init>()
                return
        }

        @Override // p227n0.InterfaceC4653l
        /* renamed from: a */
        public p227n0.C4642a0 mo984a(android.view.View r4, p227n0.C4642a0 r5) {
                r3 = this;
                com.google.android.material.bottomsheet.a r4 = r3.f5892a
                com.google.android.material.bottomsheet.BottomSheetBehavior$d r0 = r4.f5889h0
                if (r0 == 0) goto Ld
                com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout> r4 = r4.f5882a0
                java.util.ArrayList<com.google.android.material.bottomsheet.BottomSheetBehavior$d> r4 = r4.f5833P
                r4.remove(r0)
            Ld:
                com.google.android.material.bottomsheet.a r4 = r3.f5892a
                com.google.android.material.bottomsheet.a$f r0 = new com.google.android.material.bottomsheet.a$f
                android.widget.FrameLayout r1 = r4.f5885d0
                r2 = 0
                r0.<init>(r1, r5, r2)
                r4.f5889h0 = r0
                com.google.android.material.bottomsheet.a r4 = r3.f5892a
                com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout> r0 = r4.f5882a0
                com.google.android.material.bottomsheet.BottomSheetBehavior$d r4 = r4.f5889h0
                r0.m3294s(r4)
                return r5
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$b */
    public class b implements android.view.View.OnClickListener {

        /* renamed from: Y */
        public final /* synthetic */ com.google.android.material.bottomsheet.DialogC1134a f5893Y;

        public b(com.google.android.material.bottomsheet.DialogC1134a r1) {
                r0 = this;
                r0.f5893Y = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r6) {
                r5 = this;
                com.google.android.material.bottomsheet.a r6 = r5.f5893Y
                boolean r0 = r6.f5886e0
                if (r0 == 0) goto L37
                boolean r6 = r6.isShowing()
                if (r6 == 0) goto L37
                com.google.android.material.bottomsheet.a r6 = r5.f5893Y
                boolean r0 = r6.f5888g0
                if (r0 != 0) goto L2e
                android.content.Context r0 = r6.getContext()
                r1 = 1
                int[] r2 = new int[r1]
                r3 = 16843611(0x101035b, float:2.3695965E-38)
                r4 = 0
                r2[r4] = r3
                android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r2)
                boolean r2 = r0.getBoolean(r4, r1)
                r6.f5887f0 = r2
                r0.recycle()
                r6.f5888g0 = r1
            L2e:
                boolean r6 = r6.f5887f0
                if (r6 == 0) goto L37
                com.google.android.material.bottomsheet.a r6 = r5.f5893Y
                r6.cancel()
            L37:
                return
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$c */
    public class c extends p227n0.C4641a {

        /* renamed from: d */
        public final /* synthetic */ com.google.android.material.bottomsheet.DialogC1134a f5894d;

        public c(com.google.android.material.bottomsheet.DialogC1134a r1) {
                r0 = this;
                r0.f5894d = r1
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
                com.google.android.material.bottomsheet.a r3 = r2.f5894d
                boolean r3 = r3.f5886e0
                if (r3 == 0) goto L16
                r3 = 1048576(0x100000, float:1.469368E-39)
                android.view.accessibility.AccessibilityNodeInfo r0 = r4.f19337a
                r0.addAction(r3)
                r3 = 1
                goto L17
            L16:
                r3 = 0
            L17:
                android.view.accessibility.AccessibilityNodeInfo r4 = r4.f19337a
                r4.setDismissable(r3)
                return
        }

        @Override // p227n0.C4641a
        /* renamed from: g */
        public boolean mo1041g(android.view.View r3, int r4, android.os.Bundle r5) {
                r2 = this;
                r0 = 1048576(0x100000, float:1.469368E-39)
                if (r4 != r0) goto Lf
                com.google.android.material.bottomsheet.a r0 = r2.f5894d
                boolean r1 = r0.f5886e0
                if (r1 == 0) goto Lf
                r0.cancel()
                r3 = 1
                return r3
            Lf:
                boolean r3 = super.mo1041g(r3, r4, r5)
                return r3
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$d */
    public class d implements android.view.View.OnTouchListener {
        public d(com.google.android.material.bottomsheet.DialogC1134a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(android.view.View r1, android.view.MotionEvent r2) {
                r0 = this;
                r1 = 1
                return r1
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$e */
    public class e extends com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC1131d {

        /* renamed from: a */
        public final /* synthetic */ com.google.android.material.bottomsheet.DialogC1134a f5895a;

        public e(com.google.android.material.bottomsheet.DialogC1134a r1) {
                r0 = this;
                r0.f5895a = r1
                r0.<init>()
                return
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC1131d
        /* renamed from: a */
        public void mo2682a(android.view.View r1, float r2) {
                r0 = this;
                return
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC1131d
        /* renamed from: b */
        public void mo2683b(android.view.View r1, int r2) {
                r0 = this;
                r1 = 5
                if (r2 != r1) goto L8
                com.google.android.material.bottomsheet.a r1 = r0.f5895a
                r1.cancel()
            L8:
                return
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$f */
    public static class f extends com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC1131d {

        /* renamed from: a */
        public final boolean f5896a;

        /* renamed from: b */
        public final boolean f5897b;

        /* renamed from: c */
        public final p227n0.C4642a0 f5898c;

        public f(android.view.View r5, p227n0.C4642a0 r6, com.google.android.material.bottomsheet.DialogC1134a.a r7) {
                r4 = this;
                r4.<init>()
                r4.f5898c = r6
                int r6 = android.os.Build.VERSION.SDK_INT
                r7 = 1
                r0 = 0
                r1 = 23
                if (r6 < r1) goto L17
                int r6 = r5.getSystemUiVisibility()
                r6 = r6 & 8192(0x2000, float:1.148E-41)
                if (r6 == 0) goto L17
                r6 = 1
                goto L18
            L17:
                r6 = 0
            L18:
                r4.f5897b = r6
                com.google.android.material.bottomsheet.BottomSheetBehavior r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.m3280y(r5)
                t8.f r1 = r1.f5849i
                if (r1 == 0) goto L27
                t8.f$b r1 = r1.f24036Y
                android.content.res.ColorStateList r1 = r1.f24062d
                goto L2d
            L27:
                java.util.WeakHashMap<android.view.View, n0.w> r1 = p227n0.C4661t.f18570a
                android.content.res.ColorStateList r1 = p227n0.C4661t.h.m10602g(r5)
            L2d:
                r2 = 4602678819172646912(0x3fe0000000000000, double:0.5)
                if (r1 == 0) goto L40
                int r5 = r1.getDefaultColor()
                if (r5 == 0) goto L5d
                double r5 = p084f0.C1938a.m4819d(r5)
                int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
                if (r1 <= 0) goto L5d
                goto L5e
            L40:
                android.graphics.drawable.Drawable r1 = r5.getBackground()
                boolean r1 = r1 instanceof android.graphics.drawable.ColorDrawable
                if (r1 == 0) goto L61
                android.graphics.drawable.Drawable r5 = r5.getBackground()
                android.graphics.drawable.ColorDrawable r5 = (android.graphics.drawable.ColorDrawable) r5
                int r5 = r5.getColor()
                if (r5 == 0) goto L5d
                double r5 = p084f0.C1938a.m4819d(r5)
                int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
                if (r1 <= 0) goto L5d
                goto L5e
            L5d:
                r7 = 0
            L5e:
                r4.f5896a = r7
                goto L63
            L61:
                r4.f5896a = r6
            L63:
                return
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC1131d
        /* renamed from: a */
        public void mo2682a(android.view.View r1, float r2) {
                r0 = this;
                r0.m3305c(r1)
                return
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC1131d
        /* renamed from: b */
        public void mo2683b(android.view.View r1, int r2) {
                r0 = this;
                r0.m3305c(r1)
                return
        }

        /* renamed from: c */
        public final void m3305c(android.view.View r5) {
                r4 = this;
                int r0 = r5.getTop()
                n0.a0 r1 = r4.f5898c
                int r1 = r1.m10468d()
                if (r0 >= r1) goto L2c
                boolean r0 = r4.f5896a
                com.google.android.material.bottomsheet.DialogC1134a.m3302e(r5, r0)
                int r0 = r5.getPaddingLeft()
                n0.a0 r1 = r4.f5898c
                int r1 = r1.m10468d()
                int r2 = r5.getTop()
                int r1 = r1 - r2
            L20:
                int r2 = r5.getPaddingRight()
                int r3 = r5.getPaddingBottom()
                r5.setPadding(r0, r1, r2, r3)
                goto L3d
            L2c:
                int r0 = r5.getTop()
                if (r0 == 0) goto L3d
                boolean r0 = r4.f5897b
                com.google.android.material.bottomsheet.DialogC1134a.m3302e(r5, r0)
                int r0 = r5.getPaddingLeft()
                r1 = 0
                goto L20
            L3d:
                return
        }
    }

    public DialogC1134a(android.content.Context r4, int r5) {
            r3 = this;
            r0 = 1
            if (r5 != 0) goto L1b
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            r2 = 2130968681(0x7f040069, float:1.7546023E38)
            boolean r1 = r1.resolveAttribute(r2, r5, r0)
            if (r1 == 0) goto L18
            int r5 = r5.resourceId
            goto L1b
        L18:
            r5 = 2132017700(0x7f140224, float:1.9673686E38)
        L1b:
            r3.<init>(r4, r5)
            r3.f5886e0 = r0
            r3.f5887f0 = r0
            com.google.android.material.bottomsheet.a$e r4 = new com.google.android.material.bottomsheet.a$e
            r4.<init>(r3)
            r3.f5891j0 = r4
            r3.m4771c(r0)
            android.content.Context r4 = r3.getContext()
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int[] r5 = new int[r0]
            r0 = 2130968954(0x7f04017a, float:1.7546576E38)
            r1 = 0
            r5[r1] = r0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5)
            boolean r4 = r4.getBoolean(r1, r1)
            r3.f5890i0 = r4
            return
    }

    /* renamed from: e */
    public static void m3302e(android.view.View r2, boolean r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L14
            int r0 = r2.getSystemUiVisibility()
            if (r3 == 0) goto Lf
            r3 = r0 | 8192(0x2000, float:1.148E-41)
            goto L11
        Lf:
            r3 = r0 & (-8193(0xffffffffffffdfff, float:NaN))
        L11:
            r2.setSystemUiVisibility(r3)
        L14:
            return
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
            r1 = this;
            com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout> r0 = r1.f5882a0
            if (r0 != 0) goto L7
            r1.m3303d()
        L7:
            super.cancel()
            return
    }

    /* renamed from: d */
    public final android.widget.FrameLayout m3303d() {
            r3 = this;
            android.widget.FrameLayout r0 = r3.f5883b0
            if (r0 != 0) goto L3e
            android.content.Context r0 = r3.getContext()
            r1 = 2131558449(0x7f0d0031, float:1.8742214E38)
            r2 = 0
            android.view.View r0 = android.view.View.inflate(r0, r1, r2)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r3.f5883b0 = r0
            r1 = 2131362068(0x7f0a0114, float:1.8343906E38)
            android.view.View r0 = r0.findViewById(r1)
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            r3.f5884c0 = r0
            android.widget.FrameLayout r0 = r3.f5883b0
            r1 = 2131362096(0x7f0a0130, float:1.8343963E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r3.f5885d0 = r0
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.m3280y(r0)
            r3.f5882a0 = r0
            com.google.android.material.bottomsheet.BottomSheetBehavior$d r1 = r3.f5891j0
            r0.m3294s(r1)
            com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout> r0 = r3.f5882a0
            boolean r1 = r3.f5886e0
            r0.m3282B(r1)
        L3e:
            android.widget.FrameLayout r0 = r3.f5883b0
            return r0
    }

    /* renamed from: f */
    public final android.view.View m3304f(int r4, android.view.View r5, android.view.ViewGroup.LayoutParams r6) {
            r3 = this;
            r3.m3303d()
            android.widget.FrameLayout r0 = r3.f5883b0
            r1 = 2131362068(0x7f0a0114, float:1.8343906E38)
            android.view.View r0 = r0.findViewById(r1)
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            if (r4 == 0) goto L1b
            if (r5 != 0) goto L1b
            android.view.LayoutInflater r5 = r3.getLayoutInflater()
            r1 = 0
            android.view.View r5 = r5.inflate(r4, r0, r1)
        L1b:
            boolean r4 = r3.f5890i0
            if (r4 == 0) goto L2b
            android.widget.FrameLayout r4 = r3.f5885d0
            com.google.android.material.bottomsheet.a$a r1 = new com.google.android.material.bottomsheet.a$a
            r1.<init>(r3)
            java.util.WeakHashMap<android.view.View, n0.w> r2 = p227n0.C4661t.f18570a
            p227n0.C4661t.h.m10616u(r4, r1)
        L2b:
            android.widget.FrameLayout r4 = r3.f5885d0
            r4.removeAllViews()
            android.widget.FrameLayout r4 = r3.f5885d0
            if (r6 != 0) goto L38
            r4.addView(r5)
            goto L3b
        L38:
            r4.addView(r5, r6)
        L3b:
            r4 = 2131362727(0x7f0a03a7, float:1.8345243E38)
            android.view.View r4 = r0.findViewById(r4)
            com.google.android.material.bottomsheet.a$b r5 = new com.google.android.material.bottomsheet.a$b
            r5.<init>(r3)
            r4.setOnClickListener(r5)
            android.widget.FrameLayout r4 = r3.f5885d0
            com.google.android.material.bottomsheet.a$c r5 = new com.google.android.material.bottomsheet.a$c
            r5.<init>(r3)
            p227n0.C4661t.m10546v(r4, r5)
            android.widget.FrameLayout r4 = r3.f5885d0
            com.google.android.material.bottomsheet.a$d r5 = new com.google.android.material.bottomsheet.a$d
            r5.<init>(r3)
            r4.setOnTouchListener(r5)
            android.widget.FrameLayout r4 = r3.f5883b0
            return r4
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
            r4 = this;
            super.onAttachedToWindow()
            android.view.Window r0 = r4.getWindow()
            if (r0 == 0) goto L39
            boolean r1 = r4.f5890i0
            if (r1 == 0) goto L1b
            int r1 = r0.getNavigationBarColor()
            int r1 = android.graphics.Color.alpha(r1)
            r2 = 255(0xff, float:3.57E-43)
            if (r1 >= r2) goto L1b
            r1 = 1
            goto L1c
        L1b:
            r1 = 0
        L1c:
            android.widget.FrameLayout r2 = r4.f5883b0
            if (r2 == 0) goto L25
            r3 = r1 ^ 1
            r2.setFitsSystemWindows(r3)
        L25:
            androidx.coordinatorlayout.widget.CoordinatorLayout r2 = r4.f5884c0
            if (r2 == 0) goto L2e
            r3 = r1 ^ 1
            r2.setFitsSystemWindows(r3)
        L2e:
            if (r1 == 0) goto L39
            r1 = 768(0x300, float:1.076E-42)
            android.view.View r0 = r0.getDecorView()
            r0.setSystemUiVisibility(r1)
        L39:
            return
    }

    @Override // p083f.DialogC1929p, android.app.Dialog
    public void onCreate(android.os.Bundle r3) {
            r2 = this;
            super.onCreate(r3)
            android.view.Window r3 = r2.getWindow()
            if (r3 == 0) goto L21
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r3.setStatusBarColor(r1)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r3.addFlags(r1)
            r1 = 23
            if (r0 >= r1) goto L1d
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r3.addFlags(r0)
        L1d:
            r0 = -1
            r3.setLayout(r0, r0)
        L21:
            return
    }

    @Override // android.app.Dialog
    public void onStart() {
            r3 = this;
            super.onStart()
            com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout> r0 = r3.f5882a0
            if (r0 == 0) goto L10
            int r1 = r0.f5823F
            r2 = 5
            if (r1 != r2) goto L10
            r1 = 4
            r0.m3284D(r1)
        L10:
            return
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean r2) {
            r1 = this;
            super.setCancelable(r2)
            boolean r0 = r1.f5886e0
            if (r0 == r2) goto L10
            r1.f5886e0 = r2
            com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout> r0 = r1.f5882a0
            if (r0 == 0) goto L10
            r0.m3282B(r2)
        L10:
            return
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean r3) {
            r2 = this;
            super.setCanceledOnTouchOutside(r3)
            r0 = 1
            if (r3 == 0) goto Lc
            boolean r1 = r2.f5886e0
            if (r1 != 0) goto Lc
            r2.f5886e0 = r0
        Lc:
            r2.f5887f0 = r3
            r2.f5888g0 = r0
            return
    }

    @Override // p083f.DialogC1929p, android.app.Dialog
    public void setContentView(int r2) {
            r1 = this;
            r0 = 0
            android.view.View r2 = r1.m3304f(r2, r0, r0)
            super.setContentView(r2)
            return
    }

    @Override // p083f.DialogC1929p, android.app.Dialog
    public void setContentView(android.view.View r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            android.view.View r3 = r2.m3304f(r0, r3, r1)
            super.setContentView(r3)
            return
    }

    @Override // p083f.DialogC1929p, android.app.Dialog
    public void setContentView(android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            r0 = 0
            android.view.View r2 = r1.m3304f(r0, r2, r3)
            super.setContentView(r2)
            return
    }
}
