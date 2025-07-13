package androidx.appcompat.app;

/* renamed from: androidx.appcompat.app.b */
/* loaded from: classes.dex */
public class DialogC0204b extends p083f.DialogC1929p {

    /* renamed from: a0 */
    public final androidx.appcompat.app.AlertController f714a0;

    /* renamed from: androidx.appcompat.app.b$a */
    public static class a {

        /* renamed from: a */
        public final androidx.appcompat.app.AlertController.C0200b f715a;

        /* renamed from: b */
        public final int f716b;

        public a(android.content.Context r4, int r5) {
                r3 = this;
                r3.<init>()
                androidx.appcompat.app.AlertController$b r0 = new androidx.appcompat.app.AlertController$b
                android.view.ContextThemeWrapper r1 = new android.view.ContextThemeWrapper
                int r2 = androidx.appcompat.app.DialogC0204b.m455d(r4, r5)
                r1.<init>(r4, r2)
                r0.<init>(r1)
                r3.f715a = r0
                r3.f716b = r5
                return
        }

        public androidx.appcompat.app.DialogC0204b create() {
                r11 = this;
                androidx.appcompat.app.b r0 = new androidx.appcompat.app.b
                androidx.appcompat.app.AlertController$b r1 = r11.f715a
                android.content.Context r1 = r1.f695a
                int r2 = r11.f716b
                r0.<init>(r1, r2)
                androidx.appcompat.app.AlertController$b r1 = r11.f715a
                androidx.appcompat.app.AlertController r8 = r0.f714a0
                android.view.View r2 = r1.f699e
                r9 = 0
                if (r2 == 0) goto L17
                r8.f654G = r2
                goto L38
            L17:
                java.lang.CharSequence r2 = r1.f698d
                if (r2 == 0) goto L24
                r8.f670e = r2
                android.widget.TextView r3 = r8.f652E
                if (r3 == 0) goto L24
                r3.setText(r2)
            L24:
                android.graphics.drawable.Drawable r2 = r1.f697c
                if (r2 == 0) goto L38
                r8.f650C = r2
                r8.f649B = r9
                android.widget.ImageView r3 = r8.f651D
                if (r3 == 0) goto L38
                r3.setVisibility(r9)
                android.widget.ImageView r3 = r8.f651D
                r3.setImageDrawable(r2)
            L38:
                java.lang.CharSequence r4 = r1.f700f
                if (r4 != 0) goto L3d
                goto L46
            L3d:
                r3 = -1
                android.content.DialogInterface$OnClickListener r5 = r1.f701g
                r6 = 0
                r7 = 0
                r2 = r8
                r2.m454e(r3, r4, r5, r6, r7)
            L46:
                java.lang.CharSequence r4 = r1.f702h
                if (r4 != 0) goto L4b
                goto L54
            L4b:
                r3 = -2
                android.content.DialogInterface$OnClickListener r5 = r1.f703i
                r6 = 0
                r7 = 0
                r2 = r8
                r2.m454e(r3, r4, r5, r6, r7)
            L54:
                android.widget.ListAdapter r2 = r1.f706l
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L97
                android.view.LayoutInflater r2 = r1.f696b
                int r5 = r8.f659L
                android.view.View r2 = r2.inflate(r5, r4)
                androidx.appcompat.app.AlertController$RecycleListView r2 = (androidx.appcompat.app.AlertController.RecycleListView) r2
                boolean r5 = r1.f709o
                if (r5 == 0) goto L6b
                int r5 = r8.f661N
                goto L6d
            L6b:
                int r5 = r8.f662O
            L6d:
                android.widget.ListAdapter r6 = r1.f706l
                if (r6 == 0) goto L72
                goto L7c
            L72:
                androidx.appcompat.app.AlertController$d r6 = new androidx.appcompat.app.AlertController$d
                android.content.Context r7 = r1.f695a
                r10 = 16908308(0x1020014, float:2.3877285E-38)
                r6.<init>(r7, r5, r10, r4)
            L7c:
                r8.f655H = r6
                int r5 = r1.f710p
                r8.f656I = r5
                android.content.DialogInterface$OnClickListener r5 = r1.f707m
                if (r5 == 0) goto L8e
                androidx.appcompat.app.a r5 = new androidx.appcompat.app.a
                r5.<init>(r1, r8)
                r2.setOnItemClickListener(r5)
            L8e:
                boolean r5 = r1.f709o
                if (r5 == 0) goto L95
                r2.setChoiceMode(r3)
            L95:
                r8.f672g = r2
            L97:
                android.view.View r1 = r1.f708n
                if (r1 == 0) goto La1
                r8.f673h = r1
                r8.f674i = r9
                r8.f679n = r9
            La1:
                androidx.appcompat.app.AlertController$b r1 = r11.f715a
                boolean r1 = r1.f704j
                r0.setCancelable(r1)
                androidx.appcompat.app.AlertController$b r1 = r11.f715a
                boolean r1 = r1.f704j
                if (r1 == 0) goto Lb1
                r0.setCanceledOnTouchOutside(r3)
            Lb1:
                androidx.appcompat.app.AlertController$b r1 = r11.f715a
                java.util.Objects.requireNonNull(r1)
                r0.setOnCancelListener(r4)
                androidx.appcompat.app.AlertController$b r1 = r11.f715a
                java.util.Objects.requireNonNull(r1)
                r0.setOnDismissListener(r4)
                androidx.appcompat.app.AlertController$b r1 = r11.f715a
                android.content.DialogInterface$OnKeyListener r1 = r1.f705k
                if (r1 == 0) goto Lca
                r0.setOnKeyListener(r1)
            Lca:
                return r0
        }

        public android.content.Context getContext() {
                r1 = this;
                androidx.appcompat.app.AlertController$b r0 = r1.f715a
                android.content.Context r0 = r0.f695a
                return r0
        }

        public androidx.appcompat.app.DialogC0204b.a setNegativeButton(int r3, android.content.DialogInterface.OnClickListener r4) {
                r2 = this;
                androidx.appcompat.app.AlertController$b r0 = r2.f715a
                android.content.Context r1 = r0.f695a
                java.lang.CharSequence r3 = r1.getText(r3)
                r0.f702h = r3
                androidx.appcompat.app.AlertController$b r3 = r2.f715a
                r3.f703i = r4
                return r2
        }

        public androidx.appcompat.app.DialogC0204b.a setPositiveButton(int r3, android.content.DialogInterface.OnClickListener r4) {
                r2 = this;
                androidx.appcompat.app.AlertController$b r0 = r2.f715a
                android.content.Context r1 = r0.f695a
                java.lang.CharSequence r3 = r1.getText(r3)
                r0.f700f = r3
                androidx.appcompat.app.AlertController$b r3 = r2.f715a
                r3.f701g = r4
                return r2
        }

        public androidx.appcompat.app.DialogC0204b.a setTitle(java.lang.CharSequence r2) {
                r1 = this;
                androidx.appcompat.app.AlertController$b r0 = r1.f715a
                r0.f698d = r2
                return r1
        }

        public androidx.appcompat.app.DialogC0204b.a setView(android.view.View r2) {
                r1 = this;
                androidx.appcompat.app.AlertController$b r0 = r1.f715a
                r0.f708n = r2
                return r1
        }
    }

    public DialogC0204b(android.content.Context r2, int r3) {
            r1 = this;
            int r3 = m455d(r2, r3)
            r1.<init>(r2, r3)
            androidx.appcompat.app.AlertController r2 = new androidx.appcompat.app.AlertController
            android.content.Context r3 = r1.getContext()
            android.view.Window r0 = r1.getWindow()
            r2.<init>(r3, r1, r0)
            r1.f714a0 = r2
            return
    }

    /* renamed from: d */
    public static int m455d(android.content.Context r2, int r3) {
            int r0 = r3 >>> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 1
            if (r0 < r1) goto L8
            return r3
        L8:
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources$Theme r2 = r2.getTheme()
            r0 = 2130968620(0x7f04002c, float:1.7545899E38)
            r2.resolveAttribute(r0, r3, r1)
            int r2 = r3.resourceId
            return r2
    }

    @Override // p083f.DialogC1929p, android.app.Dialog
    public void onCreate(android.os.Bundle r17) {
            r16 = this;
            super.onCreate(r17)
            r0 = r16
            androidx.appcompat.app.AlertController r1 = r0.f714a0
            int r2 = r1.f658K
            int r2 = r1.f657J
            f.p r3 = r1.f667b
            r3.setContentView(r2)
            android.view.Window r2 = r1.f668c
            r3 = 2131362481(0x7f0a02b1, float:1.8344744E38)
            android.view.View r2 = r2.findViewById(r3)
            r3 = 2131362724(0x7f0a03a4, float:1.8345237E38)
            android.view.View r4 = r2.findViewById(r3)
            r5 = 2131362064(0x7f0a0110, float:1.8343898E38)
            android.view.View r6 = r2.findViewById(r5)
            r7 = 2131361956(0x7f0a00a4, float:1.8343679E38)
            android.view.View r8 = r2.findViewById(r7)
            r9 = 2131362080(0x7f0a0120, float:1.834393E38)
            android.view.View r2 = r2.findViewById(r9)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.view.View r9 = r1.f673h
            r11 = 0
            if (r9 == 0) goto L3d
            goto L4f
        L3d:
            int r9 = r1.f674i
            if (r9 == 0) goto L4e
            android.content.Context r9 = r1.f666a
            android.view.LayoutInflater r9 = android.view.LayoutInflater.from(r9)
            int r12 = r1.f674i
            android.view.View r9 = r9.inflate(r12, r2, r11)
            goto L4f
        L4e:
            r9 = 0
        L4f:
            if (r9 == 0) goto L53
            r13 = 1
            goto L54
        L53:
            r13 = 0
        L54:
            if (r13 == 0) goto L5c
            boolean r14 = androidx.appcompat.app.AlertController.m450a(r9)
            if (r14 != 0) goto L63
        L5c:
            android.view.Window r14 = r1.f668c
            r15 = 131072(0x20000, float:1.83671E-40)
            r14.setFlags(r15, r15)
        L63:
            r14 = -1
            r15 = 8
            if (r13 == 0) goto L98
            android.view.Window r13 = r1.f668c
            r12 = 2131362079(0x7f0a011f, float:1.8343928E38)
            android.view.View r12 = r13.findViewById(r12)
            android.widget.FrameLayout r12 = (android.widget.FrameLayout) r12
            android.view.ViewGroup$LayoutParams r13 = new android.view.ViewGroup$LayoutParams
            r13.<init>(r14, r14)
            r12.addView(r9, r13)
            boolean r9 = r1.f679n
            if (r9 == 0) goto L8a
            int r9 = r1.f675j
            int r13 = r1.f676k
            int r10 = r1.f677l
            int r14 = r1.f678m
            r12.setPadding(r9, r13, r10, r14)
        L8a:
            android.widget.ListView r9 = r1.f672g
            if (r9 == 0) goto L9b
            android.view.ViewGroup$LayoutParams r9 = r2.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$a r9 = (androidx.appcompat.widget.LinearLayoutCompat.C0231a) r9
            r10 = 0
            r9.weight = r10
            goto L9b
        L98:
            r2.setVisibility(r15)
        L9b:
            android.view.View r3 = r2.findViewById(r3)
            android.view.View r5 = r2.findViewById(r5)
            android.view.View r7 = r2.findViewById(r7)
            android.view.ViewGroup r3 = r1.m453d(r3, r4)
            android.view.ViewGroup r4 = r1.m453d(r5, r6)
            android.view.ViewGroup r5 = r1.m453d(r7, r8)
            android.view.Window r6 = r1.f668c
            r7 = 2131362555(0x7f0a02fb, float:1.8344894E38)
            android.view.View r6 = r6.findViewById(r7)
            androidx.core.widget.NestedScrollView r6 = (androidx.core.widget.NestedScrollView) r6
            r1.f648A = r6
            r6.setFocusable(r11)
            androidx.core.widget.NestedScrollView r6 = r1.f648A
            r6.setNestedScrollingEnabled(r11)
            r6 = 16908299(0x102000b, float:2.387726E-38)
            android.view.View r6 = r4.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r1.f653F = r6
            if (r6 != 0) goto Ld6
            goto L10c
        Ld6:
            java.lang.CharSequence r7 = r1.f671f
            if (r7 == 0) goto Lde
            r6.setText(r7)
            goto L10c
        Lde:
            r6.setVisibility(r15)
            androidx.core.widget.NestedScrollView r6 = r1.f648A
            android.widget.TextView r7 = r1.f653F
            r6.removeView(r7)
            android.widget.ListView r6 = r1.f672g
            if (r6 == 0) goto L109
            androidx.core.widget.NestedScrollView r6 = r1.f648A
            android.view.ViewParent r6 = r6.getParent()
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            androidx.core.widget.NestedScrollView r7 = r1.f648A
            int r7 = r6.indexOfChild(r7)
            r6.removeViewAt(r7)
            android.widget.ListView r8 = r1.f672g
            android.view.ViewGroup$LayoutParams r9 = new android.view.ViewGroup$LayoutParams
            r10 = -1
            r9.<init>(r10, r10)
            r6.addView(r8, r7, r9)
            goto L10c
        L109:
            r4.setVisibility(r15)
        L10c:
            r6 = 16908313(0x1020019, float:2.38773E-38)
            android.view.View r6 = r5.findViewById(r6)
            android.widget.Button r6 = (android.widget.Button) r6
            r1.f680o = r6
            android.view.View$OnClickListener r7 = r1.f665R
            r6.setOnClickListener(r7)
            java.lang.CharSequence r6 = r1.f681p
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L12f
            android.graphics.drawable.Drawable r6 = r1.f683r
            if (r6 != 0) goto L12f
            android.widget.Button r6 = r1.f680o
            r6.setVisibility(r15)
            r6 = 0
            goto L14d
        L12f:
            android.widget.Button r6 = r1.f680o
            java.lang.CharSequence r7 = r1.f681p
            r6.setText(r7)
            android.graphics.drawable.Drawable r6 = r1.f683r
            if (r6 == 0) goto L147
            int r7 = r1.f669d
            r6.setBounds(r11, r11, r7, r7)
            android.widget.Button r6 = r1.f680o
            android.graphics.drawable.Drawable r7 = r1.f683r
            r8 = 0
            r6.setCompoundDrawables(r7, r8, r8, r8)
        L147:
            android.widget.Button r6 = r1.f680o
            r6.setVisibility(r11)
            r6 = 1
        L14d:
            r7 = 16908314(0x102001a, float:2.3877302E-38)
            android.view.View r7 = r5.findViewById(r7)
            android.widget.Button r7 = (android.widget.Button) r7
            r1.f684s = r7
            android.view.View$OnClickListener r8 = r1.f665R
            r7.setOnClickListener(r8)
            java.lang.CharSequence r7 = r1.f685t
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L16f
            android.graphics.drawable.Drawable r7 = r1.f687v
            if (r7 != 0) goto L16f
            android.widget.Button r7 = r1.f684s
            r7.setVisibility(r15)
            goto L18e
        L16f:
            android.widget.Button r7 = r1.f684s
            java.lang.CharSequence r8 = r1.f685t
            r7.setText(r8)
            android.graphics.drawable.Drawable r7 = r1.f687v
            if (r7 == 0) goto L187
            int r8 = r1.f669d
            r7.setBounds(r11, r11, r8, r8)
            android.widget.Button r7 = r1.f684s
            android.graphics.drawable.Drawable r8 = r1.f687v
            r9 = 0
            r7.setCompoundDrawables(r8, r9, r9, r9)
        L187:
            android.widget.Button r7 = r1.f684s
            r7.setVisibility(r11)
            r6 = r6 | 2
        L18e:
            r7 = 16908315(0x102001b, float:2.3877305E-38)
            android.view.View r7 = r5.findViewById(r7)
            android.widget.Button r7 = (android.widget.Button) r7
            r1.f688w = r7
            android.view.View$OnClickListener r8 = r1.f665R
            r7.setOnClickListener(r8)
            java.lang.CharSequence r7 = r1.f689x
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L1b1
            android.graphics.drawable.Drawable r7 = r1.f691z
            if (r7 != 0) goto L1b1
            android.widget.Button r7 = r1.f688w
            r7.setVisibility(r15)
            r9 = 0
            goto L1d2
        L1b1:
            android.widget.Button r7 = r1.f688w
            java.lang.CharSequence r8 = r1.f689x
            r7.setText(r8)
            android.graphics.drawable.Drawable r7 = r1.f691z
            if (r7 == 0) goto L1ca
            int r8 = r1.f669d
            r7.setBounds(r11, r11, r8, r8)
            android.widget.Button r7 = r1.f688w
            android.graphics.drawable.Drawable r8 = r1.f691z
            r9 = 0
            r7.setCompoundDrawables(r8, r9, r9, r9)
            goto L1cb
        L1ca:
            r9 = 0
        L1cb:
            android.widget.Button r7 = r1.f688w
            r7.setVisibility(r11)
            r6 = r6 | 4
        L1d2:
            android.content.Context r7 = r1.f666a
            android.util.TypedValue r8 = new android.util.TypedValue
            r8.<init>()
            android.content.res.Resources$Theme r7 = r7.getTheme()
            r10 = 2130968618(0x7f04002a, float:1.7545895E38)
            r12 = 1
            r7.resolveAttribute(r10, r8, r12)
            int r7 = r8.data
            if (r7 == 0) goto L1ea
            r7 = 1
            goto L1eb
        L1ea:
            r7 = 0
        L1eb:
            r8 = 2
            if (r7 == 0) goto L200
            if (r6 != r12) goto L1f3
            android.widget.Button r7 = r1.f680o
            goto L1fd
        L1f3:
            if (r6 != r8) goto L1f8
            android.widget.Button r7 = r1.f684s
            goto L1fd
        L1f8:
            r7 = 4
            if (r6 != r7) goto L200
            android.widget.Button r7 = r1.f688w
        L1fd:
            r1.m452b(r7)
        L200:
            if (r6 == 0) goto L204
            r6 = 1
            goto L205
        L204:
            r6 = 0
        L205:
            if (r6 != 0) goto L20a
            r5.setVisibility(r15)
        L20a:
            android.view.View r6 = r1.f654G
            r7 = 2131362712(0x7f0a0398, float:1.8345212E38)
            if (r6 == 0) goto L228
            android.view.ViewGroup$LayoutParams r6 = new android.view.ViewGroup$LayoutParams
            r10 = -2
            r12 = -1
            r6.<init>(r12, r10)
            android.view.View r10 = r1.f654G
            r3.addView(r10, r11, r6)
            android.view.Window r6 = r1.f668c
            android.view.View r6 = r6.findViewById(r7)
            r6.setVisibility(r15)
            goto L29d
        L228:
            android.view.Window r6 = r1.f668c
            r10 = 16908294(0x1020006, float:2.3877246E-38)
            android.view.View r6 = r6.findViewById(r10)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r1.f651D = r6
            java.lang.CharSequence r6 = r1.f670e
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            r10 = 1
            r6 = r6 ^ r10
            if (r6 == 0) goto L28c
            boolean r6 = r1.f663P
            if (r6 == 0) goto L28c
            android.view.Window r6 = r1.f668c
            r7 = 2131361884(0x7f0a005c, float:1.8343533E38)
            android.view.View r6 = r6.findViewById(r7)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r1.f652E = r6
            java.lang.CharSequence r7 = r1.f670e
            r6.setText(r7)
            int r6 = r1.f649B
            if (r6 == 0) goto L25f
            android.widget.ImageView r7 = r1.f651D
            r7.setImageResource(r6)
            goto L29d
        L25f:
            android.graphics.drawable.Drawable r6 = r1.f650C
            if (r6 == 0) goto L269
            android.widget.ImageView r7 = r1.f651D
            r7.setImageDrawable(r6)
            goto L29d
        L269:
            android.widget.TextView r6 = r1.f652E
            android.widget.ImageView r7 = r1.f651D
            int r7 = r7.getPaddingLeft()
            android.widget.ImageView r10 = r1.f651D
            int r10 = r10.getPaddingTop()
            android.widget.ImageView r12 = r1.f651D
            int r12 = r12.getPaddingRight()
            android.widget.ImageView r13 = r1.f651D
            int r13 = r13.getPaddingBottom()
            r6.setPadding(r7, r10, r12, r13)
            android.widget.ImageView r6 = r1.f651D
            r6.setVisibility(r15)
            goto L29d
        L28c:
            android.view.Window r6 = r1.f668c
            android.view.View r6 = r6.findViewById(r7)
            r6.setVisibility(r15)
            android.widget.ImageView r6 = r1.f651D
            r6.setVisibility(r15)
            r3.setVisibility(r15)
        L29d:
            int r2 = r2.getVisibility()
            if (r2 == r15) goto L2a5
            r12 = 1
            goto L2a6
        L2a5:
            r12 = 0
        L2a6:
            if (r3 == 0) goto L2b0
            int r2 = r3.getVisibility()
            if (r2 == r15) goto L2b0
            r2 = 1
            goto L2b1
        L2b0:
            r2 = 0
        L2b1:
            int r5 = r5.getVisibility()
            if (r5 == r15) goto L2b9
            r5 = 1
            goto L2ba
        L2b9:
            r5 = 0
        L2ba:
            if (r5 != 0) goto L2c8
            r6 = 2131362679(0x7f0a0377, float:1.8345145E38)
            android.view.View r6 = r4.findViewById(r6)
            if (r6 == 0) goto L2c8
            r6.setVisibility(r11)
        L2c8:
            if (r2 == 0) goto L2e7
            androidx.core.widget.NestedScrollView r6 = r1.f648A
            if (r6 == 0) goto L2d2
            r7 = 1
            r6.setClipToPadding(r7)
        L2d2:
            java.lang.CharSequence r6 = r1.f671f
            if (r6 != 0) goto L2dd
            android.widget.ListView r6 = r1.f672g
            if (r6 == 0) goto L2db
            goto L2dd
        L2db:
            r3 = r9
            goto L2e4
        L2dd:
            r6 = 2131362708(0x7f0a0394, float:1.8345204E38)
            android.view.View r3 = r3.findViewById(r6)
        L2e4:
            if (r3 == 0) goto L2f3
            goto L2f0
        L2e7:
            r3 = 2131362680(0x7f0a0378, float:1.8345147E38)
            android.view.View r3 = r4.findViewById(r3)
            if (r3 == 0) goto L2f3
        L2f0:
            r3.setVisibility(r11)
        L2f3:
            android.widget.ListView r3 = r1.f672g
            boolean r6 = r3 instanceof androidx.appcompat.app.AlertController.RecycleListView
            if (r6 == 0) goto L31f
            androidx.appcompat.app.AlertController$RecycleListView r3 = (androidx.appcompat.app.AlertController.RecycleListView) r3
            java.util.Objects.requireNonNull(r3)
            if (r5 == 0) goto L302
            if (r2 != 0) goto L31f
        L302:
            int r6 = r3.getPaddingLeft()
            if (r2 == 0) goto L30d
            int r7 = r3.getPaddingTop()
            goto L30f
        L30d:
            int r7 = r3.f692a0
        L30f:
            int r10 = r3.getPaddingRight()
            if (r5 == 0) goto L31a
            int r13 = r3.getPaddingBottom()
            goto L31c
        L31a:
            int r13 = r3.f693b0
        L31c:
            r3.setPadding(r6, r7, r10, r13)
        L31f:
            if (r12 != 0) goto L3aa
            android.widget.ListView r3 = r1.f672g
            if (r3 == 0) goto L326
            goto L328
        L326:
            androidx.core.widget.NestedScrollView r3 = r1.f648A
        L328:
            if (r3 == 0) goto L3aa
            if (r5 == 0) goto L32d
            r11 = 2
        L32d:
            r2 = r2 | r11
            r5 = 3
            android.view.Window r6 = r1.f668c
            r7 = 2131362554(0x7f0a02fa, float:1.8344892E38)
            android.view.View r6 = r6.findViewById(r7)
            android.view.Window r7 = r1.f668c
            r10 = 2131362553(0x7f0a02f9, float:1.834489E38)
            android.view.View r7 = r7.findViewById(r10)
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 23
            if (r10 < r11) goto L356
            java.util.WeakHashMap<android.view.View, n0.w> r8 = p227n0.C4661t.f18570a
            if (r10 < r11) goto L34e
            p227n0.C4661t.i.m10625d(r3, r2, r5)
        L34e:
            if (r6 == 0) goto L353
            r4.removeView(r6)
        L353:
            if (r7 == 0) goto L3aa
            goto L3a7
        L356:
            if (r6 == 0) goto L360
            r3 = r2 & 1
            if (r3 != 0) goto L360
            r4.removeView(r6)
            r6 = r9
        L360:
            if (r7 == 0) goto L36a
            r2 = r2 & r8
            if (r2 != 0) goto L36a
            r4.removeView(r7)
            r10 = r9
            goto L36b
        L36a:
            r10 = r7
        L36b:
            if (r6 != 0) goto L36f
            if (r10 == 0) goto L3aa
        L36f:
            java.lang.CharSequence r2 = r1.f671f
            if (r2 == 0) goto L388
            androidx.core.widget.NestedScrollView r2 = r1.f648A
            f.b r3 = new f.b
            r3.<init>(r1, r6, r10)
            r2.setOnScrollChangeListener(r3)
            androidx.core.widget.NestedScrollView r2 = r1.f648A
            f.c r3 = new f.c
            r3.<init>(r1, r6, r10)
            r2.post(r3)
            goto L3aa
        L388:
            android.widget.ListView r2 = r1.f672g
            if (r2 == 0) goto L39f
            f.d r3 = new f.d
            r3.<init>(r1, r6, r10)
            r2.setOnScrollListener(r3)
            android.widget.ListView r2 = r1.f672g
            f.e r3 = new f.e
            r3.<init>(r1, r6, r10)
            r2.post(r3)
            goto L3aa
        L39f:
            if (r6 == 0) goto L3a4
            r4.removeView(r6)
        L3a4:
            if (r10 == 0) goto L3aa
            r7 = r10
        L3a7:
            r4.removeView(r7)
        L3aa:
            android.widget.ListView r2 = r1.f672g
            if (r2 == 0) goto L3c1
            android.widget.ListAdapter r3 = r1.f655H
            if (r3 == 0) goto L3c1
            r2.setAdapter(r3)
            int r1 = r1.f656I
            r3 = -1
            if (r1 <= r3) goto L3c1
            r3 = 1
            r2.setItemChecked(r1, r3)
            r2.setSelection(r1)
        L3c1:
            return
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int r3, android.view.KeyEvent r4) {
            r2 = this;
            androidx.appcompat.app.AlertController r0 = r2.f714a0
            androidx.core.widget.NestedScrollView r0 = r0.f648A
            r1 = 1
            if (r0 == 0) goto Lf
            boolean r0 = r0.m1026h(r4)
            if (r0 == 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 == 0) goto L13
            return r1
        L13:
            boolean r3 = super.onKeyDown(r3, r4)
            return r3
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int r3, android.view.KeyEvent r4) {
            r2 = this;
            androidx.appcompat.app.AlertController r0 = r2.f714a0
            androidx.core.widget.NestedScrollView r0 = r0.f648A
            r1 = 1
            if (r0 == 0) goto Lf
            boolean r0 = r0.m1026h(r4)
            if (r0 == 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 == 0) goto L13
            return r1
        L13:
            boolean r3 = super.onKeyUp(r3, r4)
            return r3
    }

    @Override // p083f.DialogC1929p, android.app.Dialog
    public void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            super.setTitle(r2)
            androidx.appcompat.app.AlertController r0 = r1.f714a0
            r0.f670e = r2
            android.widget.TextView r0 = r0.f652E
            if (r0 == 0) goto Le
            r0.setText(r2)
        Le:
            return
    }
}
