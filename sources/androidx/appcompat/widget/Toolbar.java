package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class Toolbar extends android.view.ViewGroup {

    /* renamed from: A0 */
    public android.content.res.ColorStateList f1124A0;

    /* renamed from: B0 */
    public boolean f1125B0;

    /* renamed from: C0 */
    public boolean f1126C0;

    /* renamed from: D0 */
    public final java.util.ArrayList<android.view.View> f1127D0;

    /* renamed from: E0 */
    public final java.util.ArrayList<android.view.View> f1128E0;

    /* renamed from: F0 */
    public final int[] f1129F0;

    /* renamed from: G0 */
    public androidx.appcompat.widget.Toolbar.InterfaceC0255f f1130G0;

    /* renamed from: H0 */
    public final androidx.appcompat.widget.ActionMenuView.InterfaceC0229e f1131H0;

    /* renamed from: I0 */
    public androidx.appcompat.widget.C0260a1 f1132I0;

    /* renamed from: J0 */
    public androidx.appcompat.widget.C0264c f1133J0;

    /* renamed from: K0 */
    public androidx.appcompat.widget.Toolbar.C0253d f1134K0;

    /* renamed from: L0 */
    public boolean f1135L0;

    /* renamed from: M0 */
    public final java.lang.Runnable f1136M0;

    /* renamed from: a0 */
    public androidx.appcompat.widget.ActionMenuView f1137a0;

    /* renamed from: b0 */
    public android.widget.TextView f1138b0;

    /* renamed from: c0 */
    public android.widget.TextView f1139c0;

    /* renamed from: d0 */
    public android.widget.ImageButton f1140d0;

    /* renamed from: e0 */
    public android.widget.ImageView f1141e0;

    /* renamed from: f0 */
    public android.graphics.drawable.Drawable f1142f0;

    /* renamed from: g0 */
    public java.lang.CharSequence f1143g0;

    /* renamed from: h0 */
    public android.widget.ImageButton f1144h0;

    /* renamed from: i0 */
    public android.view.View f1145i0;

    /* renamed from: j0 */
    public android.content.Context f1146j0;

    /* renamed from: k0 */
    public int f1147k0;

    /* renamed from: l0 */
    public int f1148l0;

    /* renamed from: m0 */
    public int f1149m0;

    /* renamed from: n0 */
    public int f1150n0;

    /* renamed from: o0 */
    public int f1151o0;

    /* renamed from: p0 */
    public int f1152p0;

    /* renamed from: q0 */
    public int f1153q0;

    /* renamed from: r0 */
    public int f1154r0;

    /* renamed from: s0 */
    public int f1155s0;

    /* renamed from: t0 */
    public androidx.appcompat.widget.C0294o0 f1156t0;

    /* renamed from: u0 */
    public int f1157u0;

    /* renamed from: v0 */
    public int f1158v0;

    /* renamed from: w0 */
    public int f1159w0;

    /* renamed from: x0 */
    public java.lang.CharSequence f1160x0;

    /* renamed from: y0 */
    public java.lang.CharSequence f1161y0;

    /* renamed from: z0 */
    public android.content.res.ColorStateList f1162z0;

    /* renamed from: androidx.appcompat.widget.Toolbar$a */
    public class C0250a implements androidx.appcompat.widget.ActionMenuView.InterfaceC0229e {

        /* renamed from: a */
        public final /* synthetic */ androidx.appcompat.widget.Toolbar f1163a;

        public C0250a(androidx.appcompat.widget.Toolbar r1) {
                r0 = this;
                r0.f1163a = r1
                r0.<init>()
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$b */
    public class RunnableC0251b implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ androidx.appcompat.widget.Toolbar f1164Y;

        public RunnableC0251b(androidx.appcompat.widget.Toolbar r1) {
                r0 = this;
                r0.f1164Y = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                androidx.appcompat.widget.Toolbar r0 = r1.f1164Y
                r0.m645v()
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$c */
    public class ViewOnClickListenerC0252c implements android.view.View.OnClickListener {

        /* renamed from: Y */
        public final /* synthetic */ androidx.appcompat.widget.Toolbar f1165Y;

        public ViewOnClickListenerC0252c(androidx.appcompat.widget.Toolbar r1) {
                r0 = this;
                r0.f1165Y = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                androidx.appcompat.widget.Toolbar r1 = r0.f1165Y
                androidx.appcompat.widget.Toolbar$d r1 = r1.f1134K0
                if (r1 != 0) goto L8
                r1 = 0
                goto La
            L8:
                androidx.appcompat.view.menu.g r1 = r1.f1167Z
            La:
                if (r1 == 0) goto Lf
                r1.collapseActionView()
            Lf:
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$d */
    public class C0253d implements androidx.appcompat.view.menu.InterfaceC0215i {

        /* renamed from: Y */
        public androidx.appcompat.view.menu.C0211e f1166Y;

        /* renamed from: Z */
        public androidx.appcompat.view.menu.C0213g f1167Z;

        /* renamed from: a0 */
        public final /* synthetic */ androidx.appcompat.widget.Toolbar f1168a0;

        public C0253d(androidx.appcompat.widget.Toolbar r1) {
                r0 = this;
                r0.f1168a0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0215i
        /* renamed from: a */
        public void mo472a(androidx.appcompat.view.menu.C0211e r1, boolean r2) {
                r0 = this;
                return
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0215i
        /* renamed from: r */
        public int mo469r() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0215i
        /* renamed from: s */
        public void mo493s(android.content.Context r2, androidx.appcompat.view.menu.C0211e r3) {
                r1 = this;
                androidx.appcompat.view.menu.e r2 = r1.f1166Y
                if (r2 == 0) goto Lb
                androidx.appcompat.view.menu.g r0 = r1.f1167Z
                if (r0 == 0) goto Lb
                r2.mo501d(r0)
            Lb:
                r1.f1166Y = r3
                return
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0215i
        /* renamed from: t */
        public void mo485t(android.os.Parcelable r1) {
                r0 = this;
                return
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0215i
        /* renamed from: u */
        public boolean mo486u(androidx.appcompat.view.menu.SubMenuC0218l r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0215i
        /* renamed from: v */
        public void mo487v(boolean r5) {
                r4 = this;
                androidx.appcompat.view.menu.g r5 = r4.f1167Z
                if (r5 == 0) goto L28
                androidx.appcompat.view.menu.e r5 = r4.f1166Y
                r0 = 0
                if (r5 == 0) goto L1f
                int r5 = r5.size()
                r1 = 0
            Le:
                if (r1 >= r5) goto L1f
                androidx.appcompat.view.menu.e r2 = r4.f1166Y
                android.view.MenuItem r2 = r2.getItem(r1)
                androidx.appcompat.view.menu.g r3 = r4.f1167Z
                if (r2 != r3) goto L1c
                r0 = 1
                goto L1f
            L1c:
                int r1 = r1 + 1
                goto Le
            L1f:
                if (r0 != 0) goto L28
                androidx.appcompat.view.menu.e r5 = r4.f1166Y
                androidx.appcompat.view.menu.g r0 = r4.f1167Z
                r4.mo470y(r5, r0)
            L28:
                return
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0215i
        /* renamed from: w */
        public boolean mo488w() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0215i
        /* renamed from: x */
        public android.os.Parcelable mo489x() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0215i
        /* renamed from: y */
        public boolean mo470y(androidx.appcompat.view.menu.C0211e r4, androidx.appcompat.view.menu.C0213g r5) {
                r3 = this;
                androidx.appcompat.widget.Toolbar r4 = r3.f1168a0
                android.view.View r4 = r4.f1145i0
                boolean r0 = r4 instanceof p177k.InterfaceC3618b
                if (r0 == 0) goto Ld
                k.b r4 = (p177k.InterfaceC3618b) r4
                r4.mo592e()
            Ld:
                androidx.appcompat.widget.Toolbar r4 = r3.f1168a0
                android.view.View r0 = r4.f1145i0
                r4.removeView(r0)
                androidx.appcompat.widget.Toolbar r4 = r3.f1168a0
                android.widget.ImageButton r0 = r4.f1144h0
                r4.removeView(r0)
                androidx.appcompat.widget.Toolbar r4 = r3.f1168a0
                r0 = 0
                r4.f1145i0 = r0
                java.util.ArrayList<android.view.View> r1 = r4.f1128E0
                int r1 = r1.size()
            L26:
                int r1 = r1 + (-1)
                if (r1 < 0) goto L36
                java.util.ArrayList<android.view.View> r2 = r4.f1128E0
                java.lang.Object r2 = r2.get(r1)
                android.view.View r2 = (android.view.View) r2
                r4.addView(r2)
                goto L26
            L36:
                java.util.ArrayList<android.view.View> r4 = r4.f1128E0
                r4.clear()
                r3.f1167Z = r0
                androidx.appcompat.widget.Toolbar r4 = r3.f1168a0
                r4.requestLayout()
                r4 = 0
                r5.f837C = r4
                androidx.appcompat.view.menu.e r5 = r5.f852n
                r5.m513p(r4)
                r4 = 1
                return r4
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0215i
        /* renamed from: z */
        public boolean mo471z(androidx.appcompat.view.menu.C0211e r5, androidx.appcompat.view.menu.C0213g r6) {
                r4 = this;
                androidx.appcompat.widget.Toolbar r5 = r4.f1168a0
                r5.m624c()
                androidx.appcompat.widget.Toolbar r5 = r4.f1168a0
                android.widget.ImageButton r5 = r5.f1144h0
                android.view.ViewParent r5 = r5.getParent()
                androidx.appcompat.widget.Toolbar r0 = r4.f1168a0
                if (r5 == r0) goto L23
                boolean r1 = r5 instanceof android.view.ViewGroup
                if (r1 == 0) goto L1c
                android.view.ViewGroup r5 = (android.view.ViewGroup) r5
                android.widget.ImageButton r0 = r0.f1144h0
                r5.removeView(r0)
            L1c:
                androidx.appcompat.widget.Toolbar r5 = r4.f1168a0
                android.widget.ImageButton r0 = r5.f1144h0
                r5.addView(r0)
            L23:
                androidx.appcompat.widget.Toolbar r5 = r4.f1168a0
                android.view.View r0 = r6.getActionView()
                r5.f1145i0 = r0
                r4.f1167Z = r6
                androidx.appcompat.widget.Toolbar r5 = r4.f1168a0
                android.view.View r5 = r5.f1145i0
                android.view.ViewParent r5 = r5.getParent()
                androidx.appcompat.widget.Toolbar r0 = r4.f1168a0
                r1 = 2
                if (r5 == r0) goto L65
                boolean r2 = r5 instanceof android.view.ViewGroup
                if (r2 == 0) goto L45
                android.view.ViewGroup r5 = (android.view.ViewGroup) r5
                android.view.View r0 = r0.f1145i0
                r5.removeView(r0)
            L45:
                androidx.appcompat.widget.Toolbar r5 = r4.f1168a0
                androidx.appcompat.widget.Toolbar$e r5 = r5.m630h()
                r0 = 8388611(0x800003, float:1.1754948E-38)
                androidx.appcompat.widget.Toolbar r2 = r4.f1168a0
                int r3 = r2.f1150n0
                r3 = r3 & 112(0x70, float:1.57E-43)
                r0 = r0 | r3
                r5.f8308a = r0
                r5.f1169b = r1
                android.view.View r0 = r2.f1145i0
                r0.setLayoutParams(r5)
                androidx.appcompat.widget.Toolbar r5 = r4.f1168a0
                android.view.View r0 = r5.f1145i0
                r5.addView(r0)
            L65:
                androidx.appcompat.widget.Toolbar r5 = r4.f1168a0
                int r0 = r5.getChildCount()
            L6b:
                int r0 = r0 + (-1)
                if (r0 < 0) goto L8a
                android.view.View r2 = r5.getChildAt(r0)
                android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
                androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.C0254e) r3
                int r3 = r3.f1169b
                if (r3 == r1) goto L6b
                androidx.appcompat.widget.ActionMenuView r3 = r5.f1137a0
                if (r2 == r3) goto L6b
                r5.removeViewAt(r0)
                java.util.ArrayList<android.view.View> r3 = r5.f1128E0
                r3.add(r2)
                goto L6b
            L8a:
                androidx.appcompat.widget.Toolbar r5 = r4.f1168a0
                r5.requestLayout()
                r5 = 1
                r6.f837C = r5
                androidx.appcompat.view.menu.e r6 = r6.f852n
                r0 = 0
                r6.m513p(r0)
                androidx.appcompat.widget.Toolbar r6 = r4.f1168a0
                android.view.View r6 = r6.f1145i0
                boolean r0 = r6 instanceof p177k.InterfaceC3618b
                if (r0 == 0) goto La5
                k.b r6 = (p177k.InterfaceC3618b) r6
                r6.mo591c()
            La5:
                return r5
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$e */
    public static class C0254e extends p083f.AbstractC1914a.a {

        /* renamed from: b */
        public int f1169b;

        public C0254e(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.f1169b = r1
                r1 = 8388627(0x800013, float:1.175497E-38)
                r0.f8308a = r1
                return
        }

        public C0254e(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.f1169b = r1
                return
        }

        public C0254e(android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = 0
                r0.f1169b = r1
                return
        }

        public C0254e(android.view.ViewGroup.MarginLayoutParams r2) {
                r1 = this;
                r1.<init>(r2)
                r0 = 0
                r1.f1169b = r0
                int r0 = r2.leftMargin
                r1.leftMargin = r0
                int r0 = r2.topMargin
                r1.topMargin = r0
                int r0 = r2.rightMargin
                r1.rightMargin = r0
                int r2 = r2.bottomMargin
                r1.bottomMargin = r2
                return
        }

        public C0254e(androidx.appcompat.widget.Toolbar.C0254e r2) {
                r1 = this;
                r1.<init>(r2)
                r0 = 0
                r1.f1169b = r0
                int r2 = r2.f1169b
                r1.f1169b = r2
                return
        }

        public C0254e(p083f.AbstractC1914a.a r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = 0
                r0.f1169b = r1
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$f */
    public interface InterfaceC0255f {
        boolean onMenuItemClick(android.view.MenuItem r1);
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$g */
    public static class C0256g extends p320s0.AbstractC5943a {
        public static final android.os.Parcelable.Creator<androidx.appcompat.widget.Toolbar.C0256g> CREATOR = null;

        /* renamed from: a0 */
        public int f1170a0;

        /* renamed from: b0 */
        public boolean f1171b0;

        /* renamed from: androidx.appcompat.widget.Toolbar$g$a */
        public class a implements android.os.Parcelable.ClassLoaderCreator<androidx.appcompat.widget.Toolbar.C0256g> {
            public a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // android.os.Parcelable.Creator
            public java.lang.Object createFromParcel(android.os.Parcel r3) {
                    r2 = this;
                    androidx.appcompat.widget.Toolbar$g r0 = new androidx.appcompat.widget.Toolbar$g
                    r1 = 0
                    r0.<init>(r3, r1)
                    return r0
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public androidx.appcompat.widget.Toolbar.C0256g createFromParcel(android.os.Parcel r2, java.lang.ClassLoader r3) {
                    r1 = this;
                    androidx.appcompat.widget.Toolbar$g r0 = new androidx.appcompat.widget.Toolbar$g
                    r0.<init>(r2, r3)
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public java.lang.Object[] newArray(int r1) {
                    r0 = this;
                    androidx.appcompat.widget.Toolbar$g[] r1 = new androidx.appcompat.widget.Toolbar.C0256g[r1]
                    return r1
            }
        }

        static {
                androidx.appcompat.widget.Toolbar$g$a r0 = new androidx.appcompat.widget.Toolbar$g$a
                r0.<init>()
                androidx.appcompat.widget.Toolbar.C0256g.CREATOR = r0
                return
        }

        public C0256g(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                int r2 = r1.readInt()
                r0.f1170a0 = r2
                int r1 = r1.readInt()
                if (r1 == 0) goto L11
                r1 = 1
                goto L12
            L11:
                r1 = 0
            L12:
                r0.f1171b0 = r1
                return
        }

        public C0256g(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // p320s0.AbstractC5943a, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                android.os.Parcelable r0 = r1.f22819Y
                r2.writeParcelable(r0, r3)
                int r3 = r1.f1170a0
                r2.writeInt(r3)
                boolean r3 = r1.f1171b0
                r2.writeInt(r3)
                return
        }
    }

    public Toolbar(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 2130969610(0x7f04040a, float:1.7547907E38)
            r1.<init>(r2, r3, r0)
            return
    }

    public Toolbar(android.content.Context r11, android.util.AttributeSet r12, int r13) {
            r10 = this;
            r10.<init>(r11, r12, r13)
            r0 = 8388627(0x800013, float:1.175497E-38)
            r10.f1159w0 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f1127D0 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f1128E0 = r0
            r0 = 2
            int[] r1 = new int[r0]
            r10.f1129F0 = r1
            androidx.appcompat.widget.Toolbar$a r1 = new androidx.appcompat.widget.Toolbar$a
            r1.<init>(r10)
            r10.f1131H0 = r1
            androidx.appcompat.widget.Toolbar$b r1 = new androidx.appcompat.widget.Toolbar$b
            r1.<init>(r10)
            r10.f1136M0 = r1
            android.content.Context r1 = r10.getContext()
            int[] r4 = p064e.C1495i.f7281x
            r9 = 0
            androidx.appcompat.widget.y0 r1 = androidx.appcompat.widget.C0314y0.m848r(r1, r12, r4, r13, r9)
            android.content.res.TypedArray r6 = r1.f1501b
            r8 = 0
            r2 = r10
            r3 = r11
            r5 = r12
            r7 = r13
            p227n0.C4661t.m10545u(r2, r3, r4, r5, r6, r7, r8)
            r11 = 28
            int r11 = r1.m861m(r11, r9)
            r10.f1148l0 = r11
            r11 = 19
            int r11 = r1.m861m(r11, r9)
            r10.f1149m0 = r11
            int r11 = r10.f1159w0
            int r11 = r1.m859k(r9, r11)
            r10.f1159w0 = r11
            r11 = 48
            int r11 = r1.m859k(r0, r11)
            r10.f1150n0 = r11
            r11 = 22
            int r11 = r1.m853e(r11, r9)
            r12 = 27
            boolean r13 = r1.m864p(r12)
            if (r13 == 0) goto L70
            int r11 = r1.m853e(r12, r11)
        L70:
            r10.f1155s0 = r11
            r10.f1154r0 = r11
            r10.f1153q0 = r11
            r10.f1152p0 = r11
            r11 = 25
            r12 = -1
            int r11 = r1.m853e(r11, r12)
            if (r11 < 0) goto L83
            r10.f1152p0 = r11
        L83:
            r11 = 24
            int r11 = r1.m853e(r11, r12)
            if (r11 < 0) goto L8d
            r10.f1153q0 = r11
        L8d:
            r11 = 26
            int r11 = r1.m853e(r11, r12)
            if (r11 < 0) goto L97
            r10.f1154r0 = r11
        L97:
            r11 = 23
            int r11 = r1.m853e(r11, r12)
            if (r11 < 0) goto La1
            r10.f1155s0 = r11
        La1:
            r11 = 13
            int r11 = r1.m854f(r11, r12)
            r10.f1151o0 = r11
            r11 = 9
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            int r11 = r1.m853e(r11, r12)
            r13 = 5
            int r13 = r1.m853e(r13, r12)
            r0 = 7
            int r0 = r1.m854f(r0, r9)
            r2 = 8
            int r2 = r1.m854f(r2, r9)
            r10.m625d()
            androidx.appcompat.widget.o0 r3 = r10.f1156t0
            r3.f1401h = r9
            if (r0 == r12) goto Lce
            r3.f1398e = r0
            r3.f1394a = r0
        Lce:
            if (r2 == r12) goto Ld4
            r3.f1399f = r2
            r3.f1395b = r2
        Ld4:
            if (r11 != r12) goto Ld8
            if (r13 == r12) goto Ldb
        Ld8:
            r3.m773a(r11, r13)
        Ldb:
            r11 = 10
            int r11 = r1.m853e(r11, r12)
            r10.f1157u0 = r11
            r11 = 6
            int r11 = r1.m853e(r11, r12)
            r10.f1158v0 = r11
            r11 = 4
            android.graphics.drawable.Drawable r11 = r1.m855g(r11)
            r10.f1142f0 = r11
            r11 = 3
            java.lang.CharSequence r11 = r1.m863o(r11)
            r10.f1143g0 = r11
            r11 = 21
            java.lang.CharSequence r11 = r1.m863o(r11)
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 != 0) goto L107
            r10.setTitle(r11)
        L107:
            r11 = 18
            java.lang.CharSequence r11 = r1.m863o(r11)
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 != 0) goto L116
            r10.setSubtitle(r11)
        L116:
            android.content.Context r11 = r10.getContext()
            r10.f1146j0 = r11
            r11 = 17
            int r11 = r1.m861m(r11, r9)
            r10.setPopupTheme(r11)
            r11 = 16
            android.graphics.drawable.Drawable r11 = r1.m855g(r11)
            if (r11 == 0) goto L130
            r10.setNavigationIcon(r11)
        L130:
            r11 = 15
            java.lang.CharSequence r11 = r1.m863o(r11)
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 != 0) goto L13f
            r10.setNavigationContentDescription(r11)
        L13f:
            r11 = 11
            android.graphics.drawable.Drawable r11 = r1.m855g(r11)
            if (r11 == 0) goto L14a
            r10.setLogo(r11)
        L14a:
            r11 = 12
            java.lang.CharSequence r11 = r1.m863o(r11)
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 != 0) goto L159
            r10.setLogoDescription(r11)
        L159:
            r11 = 29
            boolean r12 = r1.m864p(r11)
            if (r12 == 0) goto L168
            android.content.res.ColorStateList r11 = r1.m851c(r11)
            r10.setTitleTextColor(r11)
        L168:
            r11 = 20
            boolean r12 = r1.m864p(r11)
            if (r12 == 0) goto L177
            android.content.res.ColorStateList r11 = r1.m851c(r11)
            r10.setSubtitleTextColor(r11)
        L177:
            r11 = 14
            boolean r12 = r1.m864p(r11)
            if (r12 == 0) goto L18e
            int r11 = r1.m861m(r11, r9)
            android.view.MenuInflater r12 = r10.getMenuInflater()
            android.view.Menu r13 = r10.getMenu()
            r12.inflate(r11, r13)
        L18e:
            android.content.res.TypedArray r11 = r1.f1501b
            r11.recycle()
            return
    }

    private android.view.MenuInflater getMenuInflater() {
            r2 = this;
            k.f r0 = new k.f
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            return r0
    }

    /* renamed from: a */
    public final void m622a(java.util.List<android.view.View> r6, int r7) {
            r5 = this;
            java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
            int r0 = p227n0.C4661t.d.m10575d(r5)
            r1 = 0
            r2 = 1
            if (r0 != r2) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            int r3 = r5.getChildCount()
            int r4 = p227n0.C4661t.d.m10575d(r5)
            int r7 = android.view.Gravity.getAbsoluteGravity(r7, r4)
            r6.clear()
            if (r0 == 0) goto L43
            int r3 = r3 - r2
        L1f:
            if (r3 < 0) goto L67
            android.view.View r0 = r5.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.C0254e) r1
            int r2 = r1.f1169b
            if (r2 != 0) goto L40
            boolean r2 = r5.m644u(r0)
            if (r2 == 0) goto L40
            int r1 = r1.f8308a
            int r1 = r5.m632j(r1)
            if (r1 != r7) goto L40
            r6.add(r0)
        L40:
            int r3 = r3 + (-1)
            goto L1f
        L43:
            if (r1 >= r3) goto L67
            android.view.View r0 = r5.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r2 = (androidx.appcompat.widget.Toolbar.C0254e) r2
            int r4 = r2.f1169b
            if (r4 != 0) goto L64
            boolean r4 = r5.m644u(r0)
            if (r4 == 0) goto L64
            int r2 = r2.f8308a
            int r2 = r5.m632j(r2)
            if (r2 != r7) goto L64
            r6.add(r0)
        L64:
            int r1 = r1 + 1
            goto L43
        L67:
            return
    }

    /* renamed from: b */
    public final void m623b(android.view.View r3, boolean r4) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.Toolbar$e r0 = r2.m630h()
            goto L18
        Lb:
            boolean r1 = r2.checkLayoutParams(r0)
            if (r1 != 0) goto L16
            androidx.appcompat.widget.Toolbar$e r0 = r2.m631i(r0)
            goto L18
        L16:
            androidx.appcompat.widget.Toolbar$e r0 = (androidx.appcompat.widget.Toolbar.C0254e) r0
        L18:
            r1 = 1
            r0.f1169b = r1
            if (r4 == 0) goto L2a
            android.view.View r4 = r2.f1145i0
            if (r4 == 0) goto L2a
            r3.setLayoutParams(r0)
            java.util.ArrayList<android.view.View> r4 = r2.f1128E0
            r4.add(r3)
            goto L2d
        L2a:
            r2.addView(r3, r0)
        L2d:
            return
    }

    /* renamed from: c */
    public void m624c() {
            r4 = this;
            android.widget.ImageButton r0 = r4.f1144h0
            if (r0 != 0) goto L3f
            androidx.appcompat.widget.m r0 = new androidx.appcompat.widget.m
            android.content.Context r1 = r4.getContext()
            r2 = 0
            r3 = 2130969609(0x7f040409, float:1.7547905E38)
            r0.<init>(r1, r2, r3)
            r4.f1144h0 = r0
            android.graphics.drawable.Drawable r1 = r4.f1142f0
            r0.setImageDrawable(r1)
            android.widget.ImageButton r0 = r4.f1144h0
            java.lang.CharSequence r1 = r4.f1143g0
            r0.setContentDescription(r1)
            androidx.appcompat.widget.Toolbar$e r0 = r4.m630h()
            r1 = 8388611(0x800003, float:1.1754948E-38)
            int r2 = r4.f1150n0
            r2 = r2 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            r0.f8308a = r1
            r1 = 2
            r0.f1169b = r1
            android.widget.ImageButton r1 = r4.f1144h0
            r1.setLayoutParams(r0)
            android.widget.ImageButton r0 = r4.f1144h0
            androidx.appcompat.widget.Toolbar$c r1 = new androidx.appcompat.widget.Toolbar$c
            r1.<init>(r4)
            r0.setOnClickListener(r1)
        L3f:
            return
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = super.checkLayoutParams(r2)
            if (r0 == 0) goto Lc
            boolean r2 = r2 instanceof androidx.appcompat.widget.Toolbar.C0254e
            if (r2 == 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }

    /* renamed from: d */
    public final void m625d() {
            r1 = this;
            androidx.appcompat.widget.o0 r0 = r1.f1156t0
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.o0 r0 = new androidx.appcompat.widget.o0
            r0.<init>()
            r1.f1156t0 = r0
        Lb:
            return
    }

    /* renamed from: e */
    public final void m626e() {
            r3 = this;
            r3.m627f()
            androidx.appcompat.widget.ActionMenuView r0 = r3.f1137a0
            androidx.appcompat.view.menu.e r1 = r0.f958p0
            if (r1 != 0) goto L27
            android.view.Menu r0 = r0.getMenu()
            androidx.appcompat.view.menu.e r0 = (androidx.appcompat.view.menu.C0211e) r0
            androidx.appcompat.widget.Toolbar$d r1 = r3.f1134K0
            if (r1 != 0) goto L1a
            androidx.appcompat.widget.Toolbar$d r1 = new androidx.appcompat.widget.Toolbar$d
            r1.<init>(r3)
            r3.f1134K0 = r1
        L1a:
            androidx.appcompat.widget.ActionMenuView r1 = r3.f1137a0
            r2 = 1
            r1.setExpandedActionViewsExclusive(r2)
            androidx.appcompat.widget.Toolbar$d r1 = r3.f1134K0
            android.content.Context r2 = r3.f1146j0
            r0.m499b(r1, r2)
        L27:
            return
    }

    /* renamed from: f */
    public final void m627f() {
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.f1137a0
            if (r0 != 0) goto L3b
            androidx.appcompat.widget.ActionMenuView r0 = new androidx.appcompat.widget.ActionMenuView
            android.content.Context r1 = r3.getContext()
            r2 = 0
            r0.<init>(r1, r2)
            r3.f1137a0 = r0
            int r1 = r3.f1147k0
            r0.setPopupTheme(r1)
            androidx.appcompat.widget.ActionMenuView r0 = r3.f1137a0
            androidx.appcompat.widget.ActionMenuView$e r1 = r3.f1131H0
            r0.setOnMenuItemClickListener(r1)
            androidx.appcompat.widget.ActionMenuView r0 = r3.f1137a0
            r0.f963u0 = r2
            r0.f964v0 = r2
            androidx.appcompat.widget.Toolbar$e r0 = r3.m630h()
            r1 = 8388613(0x800005, float:1.175495E-38)
            int r2 = r3.f1150n0
            r2 = r2 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            r0.f8308a = r1
            androidx.appcompat.widget.ActionMenuView r1 = r3.f1137a0
            r1.setLayoutParams(r0)
            androidx.appcompat.widget.ActionMenuView r0 = r3.f1137a0
            r1 = 0
            r3.m623b(r0, r1)
        L3b:
            return
    }

    /* renamed from: g */
    public final void m628g() {
            r4 = this;
            android.widget.ImageButton r0 = r4.f1140d0
            if (r0 != 0) goto L26
            androidx.appcompat.widget.m r0 = new androidx.appcompat.widget.m
            android.content.Context r1 = r4.getContext()
            r2 = 0
            r3 = 2130969609(0x7f040409, float:1.7547905E38)
            r0.<init>(r1, r2, r3)
            r4.f1140d0 = r0
            androidx.appcompat.widget.Toolbar$e r0 = r4.m630h()
            r1 = 8388611(0x800003, float:1.1754948E-38)
            int r2 = r4.f1150n0
            r2 = r2 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            r0.f8308a = r1
            android.widget.ImageButton r1 = r4.f1140d0
            r1.setLayoutParams(r0)
        L26:
            return
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            androidx.appcompat.widget.Toolbar$e r0 = r1.m630h()
            return r0
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            androidx.appcompat.widget.Toolbar$e r0 = new androidx.appcompat.widget.Toolbar$e
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            androidx.appcompat.widget.Toolbar$e r1 = r0.m631i(r1)
            return r1
    }

    public java.lang.CharSequence getCollapseContentDescription() {
            r1 = this;
            android.widget.ImageButton r0 = r1.f1144h0
            if (r0 == 0) goto L9
            java.lang.CharSequence r0 = r0.getContentDescription()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public android.graphics.drawable.Drawable getCollapseIcon() {
            r1 = this;
            android.widget.ImageButton r0 = r1.f1144h0
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public int getContentInsetEnd() {
            r2 = this;
            androidx.appcompat.widget.o0 r0 = r2.f1156t0
            if (r0 == 0) goto Le
            boolean r1 = r0.f1400g
            if (r1 == 0) goto Lb
            int r0 = r0.f1394a
            goto Lf
        Lb:
            int r0 = r0.f1395b
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public int getContentInsetEndWithActions() {
            r2 = this;
            int r0 = r2.f1158v0
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L7
            goto Lb
        L7:
            int r0 = r2.getContentInsetEnd()
        Lb:
            return r0
    }

    public int getContentInsetLeft() {
            r1 = this;
            androidx.appcompat.widget.o0 r0 = r1.f1156t0
            if (r0 == 0) goto L7
            int r0 = r0.f1394a
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public int getContentInsetRight() {
            r1 = this;
            androidx.appcompat.widget.o0 r0 = r1.f1156t0
            if (r0 == 0) goto L7
            int r0 = r0.f1395b
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public int getContentInsetStart() {
            r2 = this;
            androidx.appcompat.widget.o0 r0 = r2.f1156t0
            if (r0 == 0) goto Le
            boolean r1 = r0.f1400g
            if (r1 == 0) goto Lb
            int r0 = r0.f1395b
            goto Lf
        Lb:
            int r0 = r0.f1394a
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    /* renamed from: getContentInsetStartWithNavigation */
    public int m629xeecddf82() {
            r2 = this;
            int r0 = r2.f1157u0
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L7
            goto Lb
        L7:
            int r0 = r2.getContentInsetStart()
        Lb:
            return r0
    }

    public int getCurrentContentInsetEnd() {
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.f1137a0
            r1 = 0
            if (r0 == 0) goto L11
            androidx.appcompat.view.menu.e r0 = r0.f958p0
            if (r0 == 0) goto L11
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L23
            int r0 = r3.getContentInsetEnd()
            int r2 = r3.f1158v0
            int r1 = java.lang.Math.max(r2, r1)
            int r0 = java.lang.Math.max(r0, r1)
            goto L27
        L23:
            int r0 = r3.getContentInsetEnd()
        L27:
            return r0
    }

    public int getCurrentContentInsetLeft() {
            r2 = this;
            java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
            int r0 = p227n0.C4661t.d.m10575d(r2)
            r1 = 1
            if (r0 != r1) goto Le
            int r0 = r2.getCurrentContentInsetEnd()
            goto L12
        Le:
            int r0 = r2.getCurrentContentInsetStart()
        L12:
            return r0
    }

    public int getCurrentContentInsetRight() {
            r2 = this;
            java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
            int r0 = p227n0.C4661t.d.m10575d(r2)
            r1 = 1
            if (r0 != r1) goto Le
            int r0 = r2.getCurrentContentInsetStart()
            goto L12
        Le:
            int r0 = r2.getCurrentContentInsetEnd()
        L12:
            return r0
    }

    public int getCurrentContentInsetStart() {
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.getNavigationIcon()
            if (r0 == 0) goto L16
            int r0 = r3.getContentInsetStart()
            int r1 = r3.f1157u0
            r2 = 0
            int r1 = java.lang.Math.max(r1, r2)
            int r0 = java.lang.Math.max(r0, r1)
            goto L1a
        L16:
            int r0 = r3.getContentInsetStart()
        L1a:
            return r0
    }

    public android.graphics.drawable.Drawable getLogo() {
            r1 = this;
            android.widget.ImageView r0 = r1.f1141e0
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public java.lang.CharSequence getLogoDescription() {
            r1 = this;
            android.widget.ImageView r0 = r1.f1141e0
            if (r0 == 0) goto L9
            java.lang.CharSequence r0 = r0.getContentDescription()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public android.view.Menu getMenu() {
            r1 = this;
            r1.m626e()
            androidx.appcompat.widget.ActionMenuView r0 = r1.f1137a0
            android.view.Menu r0 = r0.getMenu()
            return r0
    }

    public java.lang.CharSequence getNavigationContentDescription() {
            r1 = this;
            android.widget.ImageButton r0 = r1.f1140d0
            if (r0 == 0) goto L9
            java.lang.CharSequence r0 = r0.getContentDescription()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public android.graphics.drawable.Drawable getNavigationIcon() {
            r1 = this;
            android.widget.ImageButton r0 = r1.f1140d0
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public androidx.appcompat.widget.C0264c getOuterActionMenuPresenter() {
            r1 = this;
            androidx.appcompat.widget.c r0 = r1.f1133J0
            return r0
    }

    public android.graphics.drawable.Drawable getOverflowIcon() {
            r1 = this;
            r1.m626e()
            androidx.appcompat.widget.ActionMenuView r0 = r1.f1137a0
            android.graphics.drawable.Drawable r0 = r0.getOverflowIcon()
            return r0
    }

    android.content.Context getPopupContext() {
            r1 = this;
            android.content.Context r0 = r1.f1146j0
            return r0
    }

    public int getPopupTheme() {
            r1 = this;
            int r0 = r1.f1147k0
            return r0
    }

    public java.lang.CharSequence getSubtitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.f1161y0
            return r0
    }

    public final android.widget.TextView getSubtitleTextView() {
            r1 = this;
            android.widget.TextView r0 = r1.f1139c0
            return r0
    }

    public java.lang.CharSequence getTitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.f1160x0
            return r0
    }

    public int getTitleMarginBottom() {
            r1 = this;
            int r0 = r1.f1155s0
            return r0
    }

    public int getTitleMarginEnd() {
            r1 = this;
            int r0 = r1.f1153q0
            return r0
    }

    public int getTitleMarginStart() {
            r1 = this;
            int r0 = r1.f1152p0
            return r0
    }

    public int getTitleMarginTop() {
            r1 = this;
            int r0 = r1.f1154r0
            return r0
    }

    public final android.widget.TextView getTitleTextView() {
            r1 = this;
            android.widget.TextView r0 = r1.f1138b0
            return r0
    }

    public androidx.appcompat.widget.InterfaceC0268d0 getWrapper() {
            r2 = this;
            androidx.appcompat.widget.a1 r0 = r2.f1132I0
            if (r0 != 0) goto Lc
            androidx.appcompat.widget.a1 r0 = new androidx.appcompat.widget.a1
            r1 = 1
            r0.<init>(r2, r1)
            r2.f1132I0 = r0
        Lc:
            androidx.appcompat.widget.a1 r0 = r2.f1132I0
            return r0
    }

    /* renamed from: h */
    public androidx.appcompat.widget.Toolbar.C0254e m630h() {
            r2 = this;
            androidx.appcompat.widget.Toolbar$e r0 = new androidx.appcompat.widget.Toolbar$e
            r1 = -2
            r0.<init>(r1, r1)
            return r0
    }

    /* renamed from: i */
    public androidx.appcompat.widget.Toolbar.C0254e m631i(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.appcompat.widget.Toolbar.C0254e
            if (r0 == 0) goto Lc
            androidx.appcompat.widget.Toolbar$e r0 = new androidx.appcompat.widget.Toolbar$e
            androidx.appcompat.widget.Toolbar$e r2 = (androidx.appcompat.widget.Toolbar.C0254e) r2
            r0.<init>(r2)
            return r0
        Lc:
            boolean r0 = r2 instanceof p083f.AbstractC1914a.a
            if (r0 == 0) goto L18
            androidx.appcompat.widget.Toolbar$e r0 = new androidx.appcompat.widget.Toolbar$e
            f.a$a r2 = (p083f.AbstractC1914a.a) r2
            r0.<init>(r2)
            return r0
        L18:
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L24
            androidx.appcompat.widget.Toolbar$e r0 = new androidx.appcompat.widget.Toolbar$e
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r0.<init>(r2)
            return r0
        L24:
            androidx.appcompat.widget.Toolbar$e r0 = new androidx.appcompat.widget.Toolbar$e
            r0.<init>(r2)
            return r0
    }

    /* renamed from: j */
    public final int m632j(int r5) {
            r4 = this;
            java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
            int r0 = p227n0.C4661t.d.m10575d(r4)
            int r5 = android.view.Gravity.getAbsoluteGravity(r5, r0)
            r5 = r5 & 7
            r1 = 1
            if (r5 == r1) goto L19
            r2 = 3
            if (r5 == r2) goto L19
            r3 = 5
            if (r5 == r3) goto L19
            if (r0 != r1) goto L18
            r2 = 5
        L18:
            return r2
        L19:
            return r5
    }

    /* renamed from: k */
    public final int m633k(android.view.View r7, int r8) {
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r0 = (androidx.appcompat.widget.Toolbar.C0254e) r0
            int r7 = r7.getMeasuredHeight()
            r1 = 0
            if (r8 <= 0) goto L12
            int r8 = r7 - r8
            int r8 = r8 / 2
            goto L13
        L12:
            r8 = 0
        L13:
            int r2 = r0.f8308a
            r2 = r2 & 112(0x70, float:1.57E-43)
            r3 = 16
            r4 = 80
            r5 = 48
            if (r2 == r3) goto L27
            if (r2 == r5) goto L27
            if (r2 == r4) goto L27
            int r2 = r6.f1159w0
            r2 = r2 & 112(0x70, float:1.57E-43)
        L27:
            if (r2 == r5) goto L62
            if (r2 == r4) goto L53
            int r8 = r6.getPaddingTop()
            int r2 = r6.getPaddingBottom()
            int r3 = r6.getHeight()
            int r4 = r3 - r8
            int r4 = r4 - r2
            int r4 = r4 - r7
            int r4 = r4 / 2
            int r5 = r0.topMargin
            if (r4 >= r5) goto L43
            r4 = r5
            goto L51
        L43:
            int r3 = r3 - r2
            int r3 = r3 - r7
            int r3 = r3 - r4
            int r3 = r3 - r8
            int r7 = r0.bottomMargin
            if (r3 >= r7) goto L51
            int r7 = r7 - r3
            int r4 = r4 - r7
            int r4 = java.lang.Math.max(r1, r4)
        L51:
            int r8 = r8 + r4
            return r8
        L53:
            int r1 = r6.getHeight()
            int r2 = r6.getPaddingBottom()
            int r1 = r1 - r2
            int r1 = r1 - r7
            int r7 = r0.bottomMargin
            int r1 = r1 - r7
            int r1 = r1 - r8
            return r1
        L62:
            int r7 = r6.getPaddingTop()
            int r7 = r7 - r8
            return r7
    }

    /* renamed from: l */
    public final int m634l(android.view.View r2) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r0 = r2.getMarginStart()
            int r2 = r2.getMarginEnd()
            int r0 = r0 + r2
            return r0
    }

    /* renamed from: m */
    public final int m635m(android.view.View r2) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r0 = r2.topMargin
            int r2 = r2.bottomMargin
            int r0 = r0 + r2
            return r0
    }

    /* renamed from: n */
    public void m636n(int r3) {
            r2 = this;
            android.view.MenuInflater r0 = r2.getMenuInflater()
            android.view.Menu r1 = r2.getMenu()
            r0.inflate(r3, r1)
            return
    }

    /* renamed from: o */
    public final boolean m637o(android.view.View r2) {
            r1 = this;
            android.view.ViewParent r0 = r2.getParent()
            if (r0 == r1) goto L11
            java.util.ArrayList<android.view.View> r0 = r1.f1128E0
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto Lf
            goto L11
        Lf:
            r2 = 0
            goto L12
        L11:
            r2 = 1
        L12:
            return r2
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            java.lang.Runnable r0 = r1.f1136M0
            r1.removeCallbacks(r0)
            return
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent r6) {
            r5 = this;
            int r0 = r6.getActionMasked()
            r1 = 0
            r2 = 9
            if (r0 != r2) goto Lb
            r5.f1126C0 = r1
        Lb:
            boolean r3 = r5.f1126C0
            r4 = 1
            if (r3 != 0) goto L1a
            boolean r6 = super.onHoverEvent(r6)
            if (r0 != r2) goto L1a
            if (r6 != 0) goto L1a
            r5.f1126C0 = r4
        L1a:
            r6 = 10
            if (r0 == r6) goto L21
            r6 = 3
            if (r0 != r6) goto L23
        L21:
            r5.f1126C0 = r1
        L23:
            return r4
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
            r19 = this;
            r0 = r19
            java.util.WeakHashMap<android.view.View, n0.w> r1 = p227n0.C4661t.f18570a
            int r1 = p227n0.C4661t.d.m10575d(r19)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            int r4 = r19.getWidth()
            int r5 = r19.getHeight()
            int r6 = r19.getPaddingLeft()
            int r7 = r19.getPaddingRight()
            int r8 = r19.getPaddingTop()
            int r9 = r19.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.f1129F0
            r11[r2] = r3
            r11[r3] = r3
            int r12 = p227n0.C4661t.c.m10556d(r19)
            if (r12 < 0) goto L3c
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L3d
        L3c:
            r12 = 0
        L3d:
            android.widget.ImageButton r13 = r0.f1140d0
            boolean r13 = r0.m644u(r13)
            if (r13 == 0) goto L55
            android.widget.ImageButton r13 = r0.f1140d0
            if (r1 == 0) goto L50
            int r13 = r0.m640r(r13, r10, r11, r12)
            r14 = r13
            r13 = r6
            goto L57
        L50:
            int r13 = r0.m639q(r13, r6, r11, r12)
            goto L56
        L55:
            r13 = r6
        L56:
            r14 = r10
        L57:
            android.widget.ImageButton r15 = r0.f1144h0
            boolean r15 = r0.m644u(r15)
            if (r15 == 0) goto L6c
            android.widget.ImageButton r15 = r0.f1144h0
            if (r1 == 0) goto L68
            int r14 = r0.m640r(r15, r14, r11, r12)
            goto L6c
        L68:
            int r13 = r0.m639q(r15, r13, r11, r12)
        L6c:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1137a0
            boolean r15 = r0.m644u(r15)
            if (r15 == 0) goto L81
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1137a0
            if (r1 == 0) goto L7d
            int r13 = r0.m639q(r15, r13, r11, r12)
            goto L81
        L7d:
            int r14 = r0.m640r(r15, r14, r11, r12)
        L81:
            int r15 = r19.getCurrentContentInsetLeft()
            int r16 = r19.getCurrentContentInsetRight()
            int r2 = r15 - r13
            int r2 = java.lang.Math.max(r3, r2)
            r11[r3] = r2
            int r2 = r10 - r14
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r11[r17] = r2
            int r2 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.f1145i0
            boolean r13 = r0.m644u(r13)
            if (r13 == 0) goto Lbc
            android.view.View r13 = r0.f1145i0
            if (r1 == 0) goto Lb8
            int r10 = r0.m640r(r13, r10, r11, r12)
            goto Lbc
        Lb8:
            int r2 = r0.m639q(r13, r2, r11, r12)
        Lbc:
            android.widget.ImageView r13 = r0.f1141e0
            boolean r13 = r0.m644u(r13)
            if (r13 == 0) goto Ld1
            android.widget.ImageView r13 = r0.f1141e0
            if (r1 == 0) goto Lcd
            int r10 = r0.m640r(r13, r10, r11, r12)
            goto Ld1
        Lcd:
            int r2 = r0.m639q(r13, r2, r11, r12)
        Ld1:
            android.widget.TextView r13 = r0.f1138b0
            boolean r13 = r0.m644u(r13)
            android.widget.TextView r14 = r0.f1139c0
            boolean r14 = r0.m644u(r14)
            if (r13 == 0) goto Lf8
            android.widget.TextView r15 = r0.f1138b0
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r15 = (androidx.appcompat.widget.Toolbar.C0254e) r15
            int r3 = r15.topMargin
            r23 = r7
            android.widget.TextView r7 = r0.f1138b0
            int r7 = r7.getMeasuredHeight()
            int r7 = r7 + r3
            int r3 = r15.bottomMargin
            int r7 = r7 + r3
            r3 = 0
            int r7 = r7 + r3
            goto Lfb
        Lf8:
            r23 = r7
            r7 = 0
        Lfb:
            if (r14 == 0) goto L115
            android.widget.TextView r3 = r0.f1139c0
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.C0254e) r3
            int r15 = r3.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.f1139c0
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r15
            int r3 = r3.bottomMargin
            int r4 = r4 + r3
            int r7 = r7 + r4
            goto L117
        L115:
            r16 = r4
        L117:
            if (r13 != 0) goto L122
            if (r14 == 0) goto L11c
            goto L122
        L11c:
            r18 = r6
            r22 = r12
            goto L287
        L122:
            if (r13 == 0) goto L127
            android.widget.TextView r3 = r0.f1138b0
            goto L129
        L127:
            android.widget.TextView r3 = r0.f1139c0
        L129:
            if (r14 == 0) goto L12e
            android.widget.TextView r4 = r0.f1139c0
            goto L130
        L12e:
            android.widget.TextView r4 = r0.f1138b0
        L130:
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.C0254e) r3
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r4 = (androidx.appcompat.widget.Toolbar.C0254e) r4
            if (r13 == 0) goto L146
            android.widget.TextView r15 = r0.f1138b0
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L150
        L146:
            if (r14 == 0) goto L153
            android.widget.TextView r15 = r0.f1139c0
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L153
        L150:
            r17 = 1
            goto L155
        L153:
            r17 = 0
        L155:
            int r15 = r0.f1159w0
            r15 = r15 & 112(0x70, float:1.57E-43)
            r18 = r6
            r6 = 48
            if (r15 == r6) goto L19d
            r6 = 80
            if (r15 == r6) goto L18f
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r7
            int r6 = r6 / 2
            int r15 = r3.topMargin
            r22 = r12
            int r12 = r0.f1154r0
            r24 = r2
            int r2 = r15 + r12
            if (r6 >= r2) goto L178
            int r6 = r15 + r12
            goto L18d
        L178:
            int r5 = r5 - r9
            int r5 = r5 - r7
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r3.bottomMargin
            int r3 = r0.f1155s0
            int r2 = r2 + r3
            if (r5 >= r2) goto L18d
            int r2 = r4.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L18d:
            int r8 = r8 + r6
            goto L1ac
        L18f:
            r24 = r2
            r22 = r12
            int r5 = r5 - r9
            int r2 = r4.bottomMargin
            int r5 = r5 - r2
            int r2 = r0.f1155s0
            int r5 = r5 - r2
            int r8 = r5 - r7
            goto L1ac
        L19d:
            r24 = r2
            r22 = r12
            int r2 = r19.getPaddingTop()
            int r3 = r3.topMargin
            int r2 = r2 + r3
            int r3 = r0.f1154r0
            int r8 = r2 + r3
        L1ac:
            if (r1 == 0) goto L21d
            if (r17 == 0) goto L1b3
            int r1 = r0.f1152p0
            goto L1b4
        L1b3:
            r1 = 0
        L1b4:
            r2 = 1
            r3 = r11[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r10 = r10 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r2] = r1
            if (r13 == 0) goto L1eb
            android.widget.TextView r1 = r0.f1138b0
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.C0254e) r1
            android.widget.TextView r2 = r0.f1138b0
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.f1138b0
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f1138b0
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.f1153q0
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L1ec
        L1eb:
            r2 = r10
        L1ec:
            if (r14 == 0) goto L212
            android.widget.TextView r1 = r0.f1139c0
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.C0254e) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.f1139c0
            int r1 = r1.getMeasuredWidth()
            int r1 = r10 - r1
            android.widget.TextView r3 = r0.f1139c0
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f1139c0
            r4.layout(r1, r8, r10, r3)
            int r1 = r0.f1153q0
            int r1 = r10 - r1
            goto L213
        L212:
            r1 = r10
        L213:
            if (r17 == 0) goto L21a
            int r1 = java.lang.Math.min(r2, r1)
            r10 = r1
        L21a:
            r2 = r24
            goto L287
        L21d:
            if (r17 == 0) goto L222
            int r1 = r0.f1152p0
            goto L223
        L222:
            r1 = 0
        L223:
            r2 = 0
            r3 = r11[r2]
            int r1 = r1 - r3
            int r3 = java.lang.Math.max(r2, r1)
            int r3 = r3 + r24
            int r1 = -r1
            int r1 = java.lang.Math.max(r2, r1)
            r11[r2] = r1
            if (r13 == 0) goto L259
            android.widget.TextView r1 = r0.f1138b0
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.C0254e) r1
            android.widget.TextView r2 = r0.f1138b0
            int r2 = r2.getMeasuredWidth()
            int r2 = r2 + r3
            android.widget.TextView r4 = r0.f1138b0
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f1138b0
            r5.layout(r3, r8, r2, r4)
            int r5 = r0.f1153q0
            int r2 = r2 + r5
            int r1 = r1.bottomMargin
            int r8 = r4 + r1
            goto L25a
        L259:
            r2 = r3
        L25a:
            if (r14 == 0) goto L27e
            android.widget.TextView r1 = r0.f1139c0
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.C0254e) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.f1139c0
            int r1 = r1.getMeasuredWidth()
            int r1 = r1 + r3
            android.widget.TextView r4 = r0.f1139c0
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f1139c0
            r5.layout(r3, r8, r1, r4)
            int r4 = r0.f1153q0
            int r1 = r1 + r4
            goto L27f
        L27e:
            r1 = r3
        L27f:
            if (r17 == 0) goto L286
            int r2 = java.lang.Math.max(r2, r1)
            goto L287
        L286:
            r2 = r3
        L287:
            java.util.ArrayList<android.view.View> r1 = r0.f1127D0
            r3 = 3
            r0.m622a(r1, r3)
            java.util.ArrayList<android.view.View> r1 = r0.f1127D0
            int r1 = r1.size()
            r3 = r2
            r2 = 0
        L295:
            if (r2 >= r1) goto L2a8
            java.util.ArrayList<android.view.View> r4 = r0.f1127D0
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            r12 = r22
            int r3 = r0.m639q(r4, r3, r11, r12)
            int r2 = r2 + 1
            goto L295
        L2a8:
            r12 = r22
            java.util.ArrayList<android.view.View> r1 = r0.f1127D0
            r2 = 5
            r0.m622a(r1, r2)
            java.util.ArrayList<android.view.View> r1 = r0.f1127D0
            int r1 = r1.size()
            r2 = 0
        L2b7:
            if (r2 >= r1) goto L2c8
            java.util.ArrayList<android.view.View> r4 = r0.f1127D0
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            int r10 = r0.m640r(r4, r10, r11, r12)
            int r2 = r2 + 1
            goto L2b7
        L2c8:
            java.util.ArrayList<android.view.View> r1 = r0.f1127D0
            r2 = 1
            r0.m622a(r1, r2)
            java.util.ArrayList<android.view.View> r1 = r0.f1127D0
            r4 = 0
            r5 = r11[r4]
            r2 = r11[r2]
            int r4 = r1.size()
            r7 = r5
            r5 = 0
            r6 = 0
        L2dc:
            if (r5 >= r4) goto L30f
            java.lang.Object r8 = r1.get(r5)
            android.view.View r8 = (android.view.View) r8
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r9 = (androidx.appcompat.widget.Toolbar.C0254e) r9
            int r13 = r9.leftMargin
            int r13 = r13 - r7
            int r7 = r9.rightMargin
            int r7 = r7 - r2
            r2 = 0
            int r9 = java.lang.Math.max(r2, r13)
            int r14 = java.lang.Math.max(r2, r7)
            int r13 = -r13
            int r13 = java.lang.Math.max(r2, r13)
            int r7 = -r7
            int r7 = java.lang.Math.max(r2, r7)
            int r8 = r8.getMeasuredWidth()
            int r8 = r8 + r9
            int r8 = r8 + r14
            int r6 = r6 + r8
            int r5 = r5 + 1
            r2 = r7
            r7 = r13
            goto L2dc
        L30f:
            r2 = 0
            int r4 = r16 - r18
            int r4 = r4 - r23
            int r4 = r4 / 2
            int r4 = r4 + r18
            int r1 = r6 / 2
            int r4 = r4 - r1
            int r6 = r6 + r4
            if (r4 >= r3) goto L31f
            goto L326
        L31f:
            if (r6 <= r10) goto L325
            int r6 = r6 - r10
            int r3 = r4 - r6
            goto L326
        L325:
            r3 = r4
        L326:
            java.util.ArrayList<android.view.View> r1 = r0.f1127D0
            int r1 = r1.size()
            r2 = r3
            r3 = 0
        L32e:
            if (r3 >= r1) goto L33f
            java.util.ArrayList<android.view.View> r4 = r0.f1127D0
            java.lang.Object r4 = r4.get(r3)
            android.view.View r4 = (android.view.View) r4
            int r2 = r0.m639q(r4, r2, r11, r12)
            int r3 = r3 + 1
            goto L32e
        L33f:
            java.util.ArrayList<android.view.View> r1 = r0.f1127D0
            r1.clear()
            return
    }

    @Override // android.view.View
    public void onMeasure(int r18, int r19) {
            r17 = this;
            r7 = r17
            int[] r8 = r7.f1129F0
            boolean r9 = androidx.appcompat.widget.C0275f1.m724b(r17)
            r10 = 1
            r11 = 0
            r12 = r9 ^ 1
            android.widget.ImageButton r0 = r7.f1140d0
            boolean r0 = r7.m644u(r0)
            if (r0 == 0) goto L4e
            android.widget.ImageButton r1 = r7.f1140d0
            r5 = 0
            int r6 = r7.f1151o0
            r3 = 0
            r0 = r17
            r2 = r18
            r4 = r19
            r0.m643t(r1, r2, r3, r4, r5, r6)
            android.widget.ImageButton r0 = r7.f1140d0
            int r0 = r0.getMeasuredWidth()
            android.widget.ImageButton r1 = r7.f1140d0
            int r1 = r7.m634l(r1)
            int r1 = r1 + r0
            android.widget.ImageButton r0 = r7.f1140d0
            int r0 = r0.getMeasuredHeight()
            android.widget.ImageButton r2 = r7.f1140d0
            int r2 = r7.m635m(r2)
            int r2 = r2 + r0
            int r0 = java.lang.Math.max(r11, r2)
            android.widget.ImageButton r2 = r7.f1140d0
            int r2 = r2.getMeasuredState()
            int r2 = android.view.View.combineMeasuredStates(r11, r2)
            r13 = r0
            r14 = r2
            goto L51
        L4e:
            r1 = 0
            r13 = 0
            r14 = 0
        L51:
            android.widget.ImageButton r0 = r7.f1144h0
            boolean r0 = r7.m644u(r0)
            if (r0 == 0) goto L90
            android.widget.ImageButton r1 = r7.f1144h0
            r5 = 0
            int r6 = r7.f1151o0
            r3 = 0
            r0 = r17
            r2 = r18
            r4 = r19
            r0.m643t(r1, r2, r3, r4, r5, r6)
            android.widget.ImageButton r0 = r7.f1144h0
            int r0 = r0.getMeasuredWidth()
            android.widget.ImageButton r1 = r7.f1144h0
            int r1 = r7.m634l(r1)
            int r1 = r1 + r0
            android.widget.ImageButton r0 = r7.f1144h0
            int r0 = r0.getMeasuredHeight()
            android.widget.ImageButton r2 = r7.f1144h0
            int r2 = r7.m635m(r2)
            int r2 = r2 + r0
            int r13 = java.lang.Math.max(r13, r2)
            android.widget.ImageButton r0 = r7.f1144h0
            int r0 = r0.getMeasuredState()
            int r14 = android.view.View.combineMeasuredStates(r14, r0)
        L90:
            int r0 = r17.getCurrentContentInsetStart()
            int r2 = java.lang.Math.max(r0, r1)
            int r15 = r2 + 0
            int r0 = r0 - r1
            int r0 = java.lang.Math.max(r11, r0)
            r8[r9] = r0
            androidx.appcompat.widget.ActionMenuView r0 = r7.f1137a0
            boolean r0 = r7.m644u(r0)
            if (r0 == 0) goto Le1
            androidx.appcompat.widget.ActionMenuView r1 = r7.f1137a0
            r5 = 0
            int r6 = r7.f1151o0
            r0 = r17
            r2 = r18
            r3 = r15
            r4 = r19
            r0.m643t(r1, r2, r3, r4, r5, r6)
            androidx.appcompat.widget.ActionMenuView r0 = r7.f1137a0
            int r0 = r0.getMeasuredWidth()
            androidx.appcompat.widget.ActionMenuView r1 = r7.f1137a0
            int r1 = r7.m634l(r1)
            int r1 = r1 + r0
            androidx.appcompat.widget.ActionMenuView r0 = r7.f1137a0
            int r0 = r0.getMeasuredHeight()
            androidx.appcompat.widget.ActionMenuView r2 = r7.f1137a0
            int r2 = r7.m635m(r2)
            int r2 = r2 + r0
            int r13 = java.lang.Math.max(r13, r2)
            androidx.appcompat.widget.ActionMenuView r0 = r7.f1137a0
            int r0 = r0.getMeasuredState()
            int r14 = android.view.View.combineMeasuredStates(r14, r0)
            goto Le2
        Le1:
            r1 = 0
        Le2:
            int r0 = r17.getCurrentContentInsetEnd()
            int r2 = java.lang.Math.max(r0, r1)
            int r9 = r2 + r15
            int r0 = r0 - r1
            int r0 = java.lang.Math.max(r11, r0)
            r8[r12] = r0
            android.view.View r0 = r7.f1145i0
            boolean r0 = r7.m644u(r0)
            if (r0 == 0) goto L126
            android.view.View r1 = r7.f1145i0
            r5 = 0
            r0 = r17
            r2 = r18
            r3 = r9
            r4 = r19
            r6 = r8
            int r0 = r0.m641s(r1, r2, r3, r4, r5, r6)
            int r9 = r9 + r0
            android.view.View r0 = r7.f1145i0
            int r0 = r0.getMeasuredHeight()
            android.view.View r1 = r7.f1145i0
            int r1 = r7.m635m(r1)
            int r1 = r1 + r0
            int r13 = java.lang.Math.max(r13, r1)
            android.view.View r0 = r7.f1145i0
            int r0 = r0.getMeasuredState()
            int r14 = android.view.View.combineMeasuredStates(r14, r0)
        L126:
            android.widget.ImageView r0 = r7.f1141e0
            boolean r0 = r7.m644u(r0)
            if (r0 == 0) goto L159
            android.widget.ImageView r1 = r7.f1141e0
            r5 = 0
            r0 = r17
            r2 = r18
            r3 = r9
            r4 = r19
            r6 = r8
            int r0 = r0.m641s(r1, r2, r3, r4, r5, r6)
            int r9 = r9 + r0
            android.widget.ImageView r0 = r7.f1141e0
            int r0 = r0.getMeasuredHeight()
            android.widget.ImageView r1 = r7.f1141e0
            int r1 = r7.m635m(r1)
            int r1 = r1 + r0
            int r13 = java.lang.Math.max(r13, r1)
            android.widget.ImageView r0 = r7.f1141e0
            int r0 = r0.getMeasuredState()
            int r14 = android.view.View.combineMeasuredStates(r14, r0)
        L159:
            int r12 = r17.getChildCount()
            r15 = 0
        L15e:
            if (r15 >= r12) goto L1a2
            android.view.View r6 = r7.getChildAt(r15)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r0 = (androidx.appcompat.widget.Toolbar.C0254e) r0
            int r0 = r0.f1169b
            if (r0 != 0) goto L19f
            boolean r0 = r7.m644u(r6)
            if (r0 != 0) goto L175
            goto L19f
        L175:
            r5 = 0
            r0 = r17
            r1 = r6
            r2 = r18
            r3 = r9
            r4 = r19
            r16 = r6
            r6 = r8
            int r0 = r0.m641s(r1, r2, r3, r4, r5, r6)
            int r9 = r9 + r0
            int r0 = r16.getMeasuredHeight()
            r1 = r16
            int r2 = r7.m635m(r1)
            int r2 = r2 + r0
            int r0 = java.lang.Math.max(r13, r2)
            int r1 = r1.getMeasuredState()
            int r1 = android.view.View.combineMeasuredStates(r14, r1)
            r13 = r0
            r14 = r1
        L19f:
            int r15 = r15 + 1
            goto L15e
        L1a2:
            int r0 = r7.f1154r0
            int r1 = r7.f1155s0
            int r12 = r0 + r1
            int r0 = r7.f1152p0
            int r1 = r7.f1153q0
            int r15 = r0 + r1
            android.widget.TextView r0 = r7.f1138b0
            boolean r0 = r7.m644u(r0)
            if (r0 == 0) goto L1ee
            android.widget.TextView r1 = r7.f1138b0
            int r3 = r9 + r15
            r0 = r17
            r2 = r18
            r4 = r19
            r5 = r12
            r6 = r8
            r0.m641s(r1, r2, r3, r4, r5, r6)
            android.widget.TextView r0 = r7.f1138b0
            int r0 = r0.getMeasuredWidth()
            android.widget.TextView r1 = r7.f1138b0
            int r1 = r7.m634l(r1)
            int r1 = r1 + r0
            android.widget.TextView r0 = r7.f1138b0
            int r0 = r0.getMeasuredHeight()
            android.widget.TextView r2 = r7.f1138b0
            int r2 = r7.m635m(r2)
            int r2 = r2 + r0
            android.widget.TextView r0 = r7.f1138b0
            int r0 = r0.getMeasuredState()
            int r14 = android.view.View.combineMeasuredStates(r14, r0)
            r16 = r2
            r6 = r14
            r14 = r1
            goto L1f2
        L1ee:
            r6 = r14
            r14 = 0
            r16 = 0
        L1f2:
            android.widget.TextView r0 = r7.f1139c0
            boolean r0 = r7.m644u(r0)
            if (r0 == 0) goto L22a
            android.widget.TextView r1 = r7.f1139c0
            int r3 = r9 + r15
            int r5 = r16 + r12
            r0 = r17
            r2 = r18
            r4 = r19
            r12 = r6
            r6 = r8
            int r0 = r0.m641s(r1, r2, r3, r4, r5, r6)
            int r14 = java.lang.Math.max(r14, r0)
            android.widget.TextView r0 = r7.f1139c0
            int r0 = r0.getMeasuredHeight()
            android.widget.TextView r1 = r7.f1139c0
            int r1 = r7.m635m(r1)
            int r1 = r1 + r0
            int r16 = r1 + r16
            android.widget.TextView r0 = r7.f1139c0
            int r0 = r0.getMeasuredState()
            int r6 = android.view.View.combineMeasuredStates(r12, r0)
            goto L22b
        L22a:
            r12 = r6
        L22b:
            r0 = r16
            int r9 = r9 + r14
            int r0 = java.lang.Math.max(r13, r0)
            int r1 = r17.getPaddingLeft()
            int r2 = r17.getPaddingRight()
            int r2 = r2 + r1
            int r2 = r2 + r9
            int r1 = r17.getPaddingTop()
            int r3 = r17.getPaddingBottom()
            int r3 = r3 + r1
            int r3 = r3 + r0
            int r0 = r17.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r2, r0)
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r6
            r2 = r18
            int r0 = android.view.View.resolveSizeAndState(r0, r2, r1)
            int r1 = r17.getSuggestedMinimumHeight()
            int r1 = java.lang.Math.max(r3, r1)
            int r2 = r6 << 16
            r3 = r19
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            boolean r2 = r7.f1135L0
            if (r2 != 0) goto L26d
        L26b:
            r10 = 0
            goto L28e
        L26d:
            int r2 = r17.getChildCount()
            r3 = 0
        L272:
            if (r3 >= r2) goto L28e
            android.view.View r4 = r7.getChildAt(r3)
            boolean r5 = r7.m644u(r4)
            if (r5 == 0) goto L28b
            int r5 = r4.getMeasuredWidth()
            if (r5 <= 0) goto L28b
            int r4 = r4.getMeasuredHeight()
            if (r4 <= 0) goto L28b
            goto L26b
        L28b:
            int r3 = r3 + 1
            goto L272
        L28e:
            if (r10 == 0) goto L291
            goto L292
        L291:
            r11 = r1
        L292:
            r7.setMeasuredDimension(r0, r11)
            return
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable r4) {
            r3 = this;
            boolean r0 = r4 instanceof androidx.appcompat.widget.Toolbar.C0256g
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r4)
            return
        L8:
            androidx.appcompat.widget.Toolbar$g r4 = (androidx.appcompat.widget.Toolbar.C0256g) r4
            android.os.Parcelable r0 = r4.f22819Y
            super.onRestoreInstanceState(r0)
            androidx.appcompat.widget.ActionMenuView r0 = r3.f1137a0
            if (r0 == 0) goto L16
            androidx.appcompat.view.menu.e r0 = r0.f958p0
            goto L17
        L16:
            r0 = 0
        L17:
            int r1 = r4.f1170a0
            if (r1 == 0) goto L2a
            androidx.appcompat.widget.Toolbar$d r2 = r3.f1134K0
            if (r2 == 0) goto L2a
            if (r0 == 0) goto L2a
            android.view.MenuItem r0 = r0.findItem(r1)
            if (r0 == 0) goto L2a
            r0.expandActionView()
        L2a:
            boolean r4 = r4.f1171b0
            if (r4 == 0) goto L38
            java.lang.Runnable r4 = r3.f1136M0
            r3.removeCallbacks(r4)
            java.lang.Runnable r4 = r3.f1136M0
            r3.post(r4)
        L38:
            return
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int r3) {
            r2 = this;
            super.onRtlPropertiesChanged(r3)
            r2.m625d()
            androidx.appcompat.widget.o0 r0 = r2.f1156t0
            r1 = 1
            if (r3 != r1) goto Lc
            goto Ld
        Lc:
            r1 = 0
        Ld:
            boolean r3 = r0.f1400g
            if (r1 != r3) goto L12
            goto L40
        L12:
            r0.f1400g = r1
            boolean r3 = r0.f1401h
            if (r3 == 0) goto L38
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L2a
            int r1 = r0.f1397d
            if (r1 == r3) goto L21
            goto L23
        L21:
            int r1 = r0.f1398e
        L23:
            r0.f1394a = r1
            int r1 = r0.f1396c
            if (r1 == r3) goto L3c
            goto L3e
        L2a:
            int r1 = r0.f1396c
            if (r1 == r3) goto L2f
            goto L31
        L2f:
            int r1 = r0.f1398e
        L31:
            r0.f1394a = r1
            int r1 = r0.f1397d
            if (r1 == r3) goto L3c
            goto L3e
        L38:
            int r3 = r0.f1398e
            r0.f1394a = r3
        L3c:
            int r1 = r0.f1399f
        L3e:
            r0.f1395b = r1
        L40:
            return
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            androidx.appcompat.widget.Toolbar$g r0 = new androidx.appcompat.widget.Toolbar$g
            android.os.Parcelable r1 = super.onSaveInstanceState()
            r0.<init>(r1)
            androidx.appcompat.widget.Toolbar$d r1 = r2.f1134K0
            if (r1 == 0) goto L15
            androidx.appcompat.view.menu.g r1 = r1.f1167Z
            if (r1 == 0) goto L15
            int r1 = r1.f839a
            r0.f1170a0 = r1
        L15:
            boolean r1 = r2.m638p()
            r0.f1171b0 = r1
            return r0
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r5) {
            r4 = this;
            int r0 = r5.getActionMasked()
            r1 = 0
            if (r0 != 0) goto L9
            r4.f1125B0 = r1
        L9:
            boolean r2 = r4.f1125B0
            r3 = 1
            if (r2 != 0) goto L18
            boolean r5 = super.onTouchEvent(r5)
            if (r0 != 0) goto L18
            if (r5 != 0) goto L18
            r4.f1125B0 = r3
        L18:
            if (r0 == r3) goto L1d
            r5 = 3
            if (r0 != r5) goto L1f
        L1d:
            r4.f1125B0 = r1
        L1f:
            return r3
    }

    /* renamed from: p */
    public boolean m638p() {
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.f1137a0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L16
            androidx.appcompat.widget.c r0 = r0.f962t0
            if (r0 == 0) goto L12
            boolean r0 = r0.m698f()
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            if (r0 == 0) goto L16
            goto L17
        L16:
            r1 = 0
        L17:
            return r1
    }

    /* renamed from: q */
    public final int m639q(android.view.View r5, int r6, int[] r7, int r8) {
            r4 = this;
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r0 = (androidx.appcompat.widget.Toolbar.C0254e) r0
            int r1 = r0.leftMargin
            r2 = 0
            r3 = r7[r2]
            int r1 = r1 - r3
            int r3 = java.lang.Math.max(r2, r1)
            int r3 = r3 + r6
            int r6 = -r1
            int r6 = java.lang.Math.max(r2, r6)
            r7[r2] = r6
            int r6 = r4.m633k(r5, r8)
            int r7 = r5.getMeasuredWidth()
            int r8 = r3 + r7
            int r1 = r5.getMeasuredHeight()
            int r1 = r1 + r6
            r5.layout(r3, r6, r8, r1)
            int r5 = r0.rightMargin
            int r7 = r7 + r5
            int r7 = r7 + r3
            return r7
    }

    /* renamed from: r */
    public final int m640r(android.view.View r6, int r7, int[] r8, int r9) {
            r5 = this;
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r0 = (androidx.appcompat.widget.Toolbar.C0254e) r0
            int r1 = r0.rightMargin
            r2 = 1
            r3 = r8[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r7 = r7 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r8[r2] = r1
            int r8 = r5.m633k(r6, r9)
            int r9 = r6.getMeasuredWidth()
            int r1 = r7 - r9
            int r2 = r6.getMeasuredHeight()
            int r2 = r2 + r8
            r6.layout(r1, r8, r7, r2)
            int r6 = r0.leftMargin
            int r9 = r9 + r6
            int r7 = r7 - r9
            return r7
    }

    /* renamed from: s */
    public final int m641s(android.view.View r8, int r9, int r10, int r11, int r12, int[] r13) {
            r7 = this;
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r1 = r0.leftMargin
            r2 = 0
            r3 = r13[r2]
            int r1 = r1 - r3
            int r3 = r0.rightMargin
            r4 = 1
            r5 = r13[r4]
            int r3 = r3 - r5
            int r5 = java.lang.Math.max(r2, r1)
            int r6 = java.lang.Math.max(r2, r3)
            int r6 = r6 + r5
            int r1 = -r1
            int r1 = java.lang.Math.max(r2, r1)
            r13[r2] = r1
            int r1 = -r3
            int r1 = java.lang.Math.max(r2, r1)
            r13[r4] = r1
            int r13 = r7.getPaddingLeft()
            int r1 = r7.getPaddingRight()
            int r1 = r1 + r13
            int r1 = r1 + r6
            int r1 = r1 + r10
            int r10 = r0.width
            int r9 = android.view.ViewGroup.getChildMeasureSpec(r9, r1, r10)
            int r10 = r7.getPaddingTop()
            int r13 = r7.getPaddingBottom()
            int r13 = r13 + r10
            int r10 = r0.topMargin
            int r13 = r13 + r10
            int r10 = r0.bottomMargin
            int r13 = r13 + r10
            int r13 = r13 + r12
            int r10 = r0.height
            int r10 = android.view.ViewGroup.getChildMeasureSpec(r11, r13, r10)
            r8.measure(r9, r10)
            int r8 = r8.getMeasuredWidth()
            int r8 = r8 + r6
            return r8
    }

    public void setCollapseContentDescription(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            java.lang.CharSequence r2 = r0.getText(r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setCollapseContentDescription(r2)
            return
    }

    public void setCollapseContentDescription(java.lang.CharSequence r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L9
            r1.m624c()
        L9:
            android.widget.ImageButton r0 = r1.f1144h0
            if (r0 == 0) goto L10
            r0.setContentDescription(r2)
        L10:
            return
    }

    public void setCollapseIcon(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = p102g.C2199a.m5784b(r0, r2)
            r1.setCollapseIcon(r2)
            return
    }

    public void setCollapseIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            r1.m624c()
            android.widget.ImageButton r0 = r1.f1144h0
            r0.setImageDrawable(r2)
            goto L14
        Lb:
            android.widget.ImageButton r2 = r1.f1144h0
            if (r2 == 0) goto L14
            android.graphics.drawable.Drawable r0 = r1.f1142f0
            r2.setImageDrawable(r0)
        L14:
            return
    }

    public void setCollapsible(boolean r1) {
            r0 = this;
            r0.f1135L0 = r1
            r0.requestLayout()
            return
    }

    public void setContentInsetEndWithActions(int r2) {
            r1 = this;
            if (r2 >= 0) goto L4
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L4:
            int r0 = r1.f1158v0
            if (r2 == r0) goto L13
            r1.f1158v0 = r2
            android.graphics.drawable.Drawable r2 = r1.getNavigationIcon()
            if (r2 == 0) goto L13
            r1.requestLayout()
        L13:
            return
    }

    /* renamed from: setContentInsetStartWithNavigation */
    public void m642xcc4b10f6(int r2) {
            r1 = this;
            if (r2 >= 0) goto L4
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L4:
            int r0 = r1.f1157u0
            if (r2 == r0) goto L13
            r1.f1157u0 = r2
            android.graphics.drawable.Drawable r2 = r1.getNavigationIcon()
            if (r2 == 0) goto L13
            r1.requestLayout()
        L13:
            return
    }

    public void setLogo(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = p102g.C2199a.m5784b(r0, r2)
            r1.setLogo(r2)
            return
    }

    public void setLogo(android.graphics.drawable.Drawable r4) {
            r3 = this;
            if (r4 == 0) goto L21
            android.widget.ImageView r0 = r3.f1141e0
            if (r0 != 0) goto L12
            androidx.appcompat.widget.AppCompatImageView r0 = new androidx.appcompat.widget.AppCompatImageView
            android.content.Context r1 = r3.getContext()
            r2 = 0
            r0.<init>(r1, r2)
            r3.f1141e0 = r0
        L12:
            android.widget.ImageView r0 = r3.f1141e0
            boolean r0 = r3.m637o(r0)
            if (r0 != 0) goto L37
            android.widget.ImageView r0 = r3.f1141e0
            r1 = 1
            r3.m623b(r0, r1)
            goto L37
        L21:
            android.widget.ImageView r0 = r3.f1141e0
            if (r0 == 0) goto L37
            boolean r0 = r3.m637o(r0)
            if (r0 == 0) goto L37
            android.widget.ImageView r0 = r3.f1141e0
            r3.removeView(r0)
            java.util.ArrayList<android.view.View> r0 = r3.f1128E0
            android.widget.ImageView r1 = r3.f1141e0
            r0.remove(r1)
        L37:
            android.widget.ImageView r0 = r3.f1141e0
            if (r0 == 0) goto L3e
            r0.setImageDrawable(r4)
        L3e:
            return
    }

    public void setLogoDescription(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            java.lang.CharSequence r2 = r0.getText(r2)
            r1.setLogoDescription(r2)
            return
    }

    public void setLogoDescription(java.lang.CharSequence r4) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L16
            android.widget.ImageView r0 = r3.f1141e0
            if (r0 != 0) goto L16
            androidx.appcompat.widget.AppCompatImageView r0 = new androidx.appcompat.widget.AppCompatImageView
            android.content.Context r1 = r3.getContext()
            r2 = 0
            r0.<init>(r1, r2)
            r3.f1141e0 = r0
        L16:
            android.widget.ImageView r0 = r3.f1141e0
            if (r0 == 0) goto L1d
            r0.setContentDescription(r4)
        L1d:
            return
    }

    public void setNavigationContentDescription(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            java.lang.CharSequence r2 = r0.getText(r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setNavigationContentDescription(r2)
            return
    }

    public void setNavigationContentDescription(java.lang.CharSequence r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L9
            r1.m628g()
        L9:
            android.widget.ImageButton r0 = r1.f1140d0
            if (r0 == 0) goto L10
            r0.setContentDescription(r2)
        L10:
            return
    }

    public void setNavigationIcon(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = p102g.C2199a.m5784b(r0, r2)
            r1.setNavigationIcon(r2)
            return
    }

    public void setNavigationIcon(android.graphics.drawable.Drawable r3) {
            r2 = this;
            if (r3 == 0) goto L14
            r2.m628g()
            android.widget.ImageButton r0 = r2.f1140d0
            boolean r0 = r2.m637o(r0)
            if (r0 != 0) goto L2a
            android.widget.ImageButton r0 = r2.f1140d0
            r1 = 1
            r2.m623b(r0, r1)
            goto L2a
        L14:
            android.widget.ImageButton r0 = r2.f1140d0
            if (r0 == 0) goto L2a
            boolean r0 = r2.m637o(r0)
            if (r0 == 0) goto L2a
            android.widget.ImageButton r0 = r2.f1140d0
            r2.removeView(r0)
            java.util.ArrayList<android.view.View> r0 = r2.f1128E0
            android.widget.ImageButton r1 = r2.f1140d0
            r0.remove(r1)
        L2a:
            android.widget.ImageButton r0 = r2.f1140d0
            if (r0 == 0) goto L31
            r0.setImageDrawable(r3)
        L31:
            return
    }

    public void setNavigationOnClickListener(android.view.View.OnClickListener r2) {
            r1 = this;
            r1.m628g()
            android.widget.ImageButton r0 = r1.f1140d0
            r0.setOnClickListener(r2)
            return
    }

    public void setOnMenuItemClickListener(androidx.appcompat.widget.Toolbar.InterfaceC0255f r1) {
            r0 = this;
            r0.f1130G0 = r1
            return
    }

    public void setOverflowIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            r1.m626e()
            androidx.appcompat.widget.ActionMenuView r0 = r1.f1137a0
            r0.setOverflowIcon(r2)
            return
    }

    public void setPopupTheme(int r3) {
            r2 = this;
            int r0 = r2.f1147k0
            if (r0 == r3) goto L1a
            r2.f1147k0 = r3
            if (r3 != 0) goto Lf
            android.content.Context r3 = r2.getContext()
            r2.f1146j0 = r3
            goto L1a
        Lf:
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            r2.f1146j0 = r0
        L1a:
            return
    }

    public void setSubtitle(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            java.lang.CharSequence r2 = r0.getText(r2)
            r1.setSubtitle(r2)
            return
    }

    public void setSubtitle(java.lang.CharSequence r4) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L41
            android.widget.TextView r0 = r3.f1139c0
            if (r0 != 0) goto L32
            android.content.Context r0 = r3.getContext()
            androidx.appcompat.widget.AppCompatTextView r1 = new androidx.appcompat.widget.AppCompatTextView
            r2 = 0
            r1.<init>(r0, r2)
            r3.f1139c0 = r1
            r1.setSingleLine()
            android.widget.TextView r1 = r3.f1139c0
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            r1.setEllipsize(r2)
            int r1 = r3.f1149m0
            if (r1 == 0) goto L29
            android.widget.TextView r2 = r3.f1139c0
            r2.setTextAppearance(r0, r1)
        L29:
            android.content.res.ColorStateList r0 = r3.f1124A0
            if (r0 == 0) goto L32
            android.widget.TextView r1 = r3.f1139c0
            r1.setTextColor(r0)
        L32:
            android.widget.TextView r0 = r3.f1139c0
            boolean r0 = r3.m637o(r0)
            if (r0 != 0) goto L57
            android.widget.TextView r0 = r3.f1139c0
            r1 = 1
            r3.m623b(r0, r1)
            goto L57
        L41:
            android.widget.TextView r0 = r3.f1139c0
            if (r0 == 0) goto L57
            boolean r0 = r3.m637o(r0)
            if (r0 == 0) goto L57
            android.widget.TextView r0 = r3.f1139c0
            r3.removeView(r0)
            java.util.ArrayList<android.view.View> r0 = r3.f1128E0
            android.widget.TextView r1 = r3.f1139c0
            r0.remove(r1)
        L57:
            android.widget.TextView r0 = r3.f1139c0
            if (r0 == 0) goto L5e
            r0.setText(r4)
        L5e:
            r3.f1161y0 = r4
            return
    }

    public void setSubtitleTextColor(int r1) {
            r0 = this;
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setSubtitleTextColor(r1)
            return
    }

    public void setSubtitleTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            r1.f1124A0 = r2
            android.widget.TextView r0 = r1.f1139c0
            if (r0 == 0) goto L9
            r0.setTextColor(r2)
        L9:
            return
    }

    public void setTitle(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            java.lang.CharSequence r2 = r0.getText(r2)
            r1.setTitle(r2)
            return
    }

    public void setTitle(java.lang.CharSequence r4) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L41
            android.widget.TextView r0 = r3.f1138b0
            if (r0 != 0) goto L32
            android.content.Context r0 = r3.getContext()
            androidx.appcompat.widget.AppCompatTextView r1 = new androidx.appcompat.widget.AppCompatTextView
            r2 = 0
            r1.<init>(r0, r2)
            r3.f1138b0 = r1
            r1.setSingleLine()
            android.widget.TextView r1 = r3.f1138b0
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            r1.setEllipsize(r2)
            int r1 = r3.f1148l0
            if (r1 == 0) goto L29
            android.widget.TextView r2 = r3.f1138b0
            r2.setTextAppearance(r0, r1)
        L29:
            android.content.res.ColorStateList r0 = r3.f1162z0
            if (r0 == 0) goto L32
            android.widget.TextView r1 = r3.f1138b0
            r1.setTextColor(r0)
        L32:
            android.widget.TextView r0 = r3.f1138b0
            boolean r0 = r3.m637o(r0)
            if (r0 != 0) goto L57
            android.widget.TextView r0 = r3.f1138b0
            r1 = 1
            r3.m623b(r0, r1)
            goto L57
        L41:
            android.widget.TextView r0 = r3.f1138b0
            if (r0 == 0) goto L57
            boolean r0 = r3.m637o(r0)
            if (r0 == 0) goto L57
            android.widget.TextView r0 = r3.f1138b0
            r3.removeView(r0)
            java.util.ArrayList<android.view.View> r0 = r3.f1128E0
            android.widget.TextView r1 = r3.f1138b0
            r0.remove(r1)
        L57:
            android.widget.TextView r0 = r3.f1138b0
            if (r0 == 0) goto L5e
            r0.setText(r4)
        L5e:
            r3.f1160x0 = r4
            return
    }

    public void setTitleMarginBottom(int r1) {
            r0 = this;
            r0.f1155s0 = r1
            r0.requestLayout()
            return
    }

    public void setTitleMarginEnd(int r1) {
            r0 = this;
            r0.f1153q0 = r1
            r0.requestLayout()
            return
    }

    public void setTitleMarginStart(int r1) {
            r0 = this;
            r0.f1152p0 = r1
            r0.requestLayout()
            return
    }

    public void setTitleMarginTop(int r1) {
            r0 = this;
            r0.f1154r0 = r1
            r0.requestLayout()
            return
    }

    public void setTitleTextColor(int r1) {
            r0 = this;
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setTitleTextColor(r1)
            return
    }

    public void setTitleTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            r1.f1162z0 = r2
            android.widget.TextView r0 = r1.f1138b0
            if (r0 == 0) goto L9
            r0.setTextColor(r2)
        L9:
            return
    }

    /* renamed from: t */
    public final void m643t(android.view.View r4, int r5, int r6, int r7, int r8, int r9) {
            r3 = this;
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r1 = r3.getPaddingLeft()
            int r2 = r3.getPaddingRight()
            int r2 = r2 + r1
            int r1 = r0.leftMargin
            int r2 = r2 + r1
            int r1 = r0.rightMargin
            int r2 = r2 + r1
            int r2 = r2 + r6
            int r6 = r0.width
            int r5 = android.view.ViewGroup.getChildMeasureSpec(r5, r2, r6)
            int r6 = r3.getPaddingTop()
            int r1 = r3.getPaddingBottom()
            int r1 = r1 + r6
            int r6 = r0.topMargin
            int r1 = r1 + r6
            int r6 = r0.bottomMargin
            int r1 = r1 + r6
            int r1 = r1 + r8
            int r6 = r0.height
            int r6 = android.view.ViewGroup.getChildMeasureSpec(r7, r1, r6)
            int r7 = android.view.View.MeasureSpec.getMode(r6)
            r8 = 1073741824(0x40000000, float:2.0)
            if (r7 == r8) goto L4a
            if (r9 < 0) goto L4a
            if (r7 == 0) goto L46
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r9 = java.lang.Math.min(r6, r9)
        L46:
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r8)
        L4a:
            r4.measure(r5, r6)
            return
    }

    /* renamed from: u */
    public final boolean m644u(android.view.View r2) {
            r1 = this;
            if (r2 == 0) goto L12
            android.view.ViewParent r0 = r2.getParent()
            if (r0 != r1) goto L12
            int r2 = r2.getVisibility()
            r0 = 8
            if (r2 == r0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }

    /* renamed from: v */
    public boolean m645v() {
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.f1137a0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L16
            androidx.appcompat.widget.c r0 = r0.f962t0
            if (r0 == 0) goto L12
            boolean r0 = r0.m699g()
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            if (r0 == 0) goto L16
            goto L17
        L16:
            r1 = 0
        L17:
            return r1
    }
}
