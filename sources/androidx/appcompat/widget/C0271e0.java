package androidx.appcompat.widget;

@android.annotation.SuppressLint({"RestrictedAPI"})
/* renamed from: androidx.appcompat.widget.e0 */
/* loaded from: classes.dex */
public class C0271e0 {

    /* renamed from: a */
    public static final int[] f1272a = null;

    /* renamed from: b */
    public static final int[] f1273b = null;

    /* renamed from: c */
    public static final android.graphics.Rect f1274c = null;

    /* renamed from: d */
    public static java.lang.Class<?> f1275d;

    static {
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 16842912(0x10100a0, float:2.3694006E-38)
            r2 = 0
            r0[r2] = r1
            androidx.appcompat.widget.C0271e0.f1272a = r0
            int[] r0 = new int[r2]
            androidx.appcompat.widget.C0271e0.f1273b = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            androidx.appcompat.widget.C0271e0.f1274c = r0
            java.lang.String r0 = "android.graphics.Insets"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L1e
            androidx.appcompat.widget.C0271e0.f1275d = r0     // Catch: java.lang.ClassNotFoundException -> L1e
        L1e:
            return
    }

    /* renamed from: a */
    public static boolean m707a(android.graphics.drawable.Drawable r4) {
            boolean r0 = r4 instanceof android.graphics.drawable.DrawableContainer
            if (r0 == 0) goto L23
            android.graphics.drawable.Drawable$ConstantState r4 = r4.getConstantState()
            boolean r0 = r4 instanceof android.graphics.drawable.DrawableContainer.DrawableContainerState
            if (r0 == 0) goto L4a
            android.graphics.drawable.DrawableContainer$DrawableContainerState r4 = (android.graphics.drawable.DrawableContainer.DrawableContainerState) r4
            android.graphics.drawable.Drawable[] r4 = r4.getChildren()
            int r0 = r4.length
            r1 = 0
            r2 = 0
        L15:
            if (r2 >= r0) goto L4a
            r3 = r4[r2]
            boolean r3 = m707a(r3)
            if (r3 != 0) goto L20
            return r1
        L20:
            int r2 = r2 + 1
            goto L15
        L23:
            boolean r0 = r4 instanceof p103g0.InterfaceC2202c
            if (r0 == 0) goto L32
            g0.c r4 = (p103g0.InterfaceC2202c) r4
            android.graphics.drawable.Drawable r4 = r4.mo5794b()
        L2d:
            boolean r4 = m707a(r4)
            return r4
        L32:
            boolean r0 = r4 instanceof p116h.C2433d
            if (r0 == 0) goto L3f
            h.d r4 = (p116h.C2433d) r4
            android.graphics.drawable.Drawable r4 = r4.f10865Y
            boolean r4 = m707a(r4)
            return r4
        L3f:
            boolean r0 = r4 instanceof android.graphics.drawable.ScaleDrawable
            if (r0 == 0) goto L4a
            android.graphics.drawable.ScaleDrawable r4 = (android.graphics.drawable.ScaleDrawable) r4
            android.graphics.drawable.Drawable r4 = r4.getDrawable()
            goto L2d
        L4a:
            r4 = 1
            return r4
    }

    /* renamed from: b */
    public static void m708b(android.graphics.drawable.Drawable r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 != r1) goto L2e
            java.lang.String r0 = "android.graphics.drawable.VectorDrawable"
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getName()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2e
            int[] r0 = r2.getState()
            if (r0 == 0) goto L26
            int r1 = r0.length
            if (r1 != 0) goto L20
            goto L26
        L20:
            int[] r1 = androidx.appcompat.widget.C0271e0.f1273b
            r2.setState(r1)
            goto L2b
        L26:
            int[] r1 = androidx.appcompat.widget.C0271e0.f1272a
            r2.setState(r1)
        L2b:
            r2.setState(r0)
        L2e:
            return
    }

    /* renamed from: c */
    public static android.graphics.Rect m709c(android.graphics.drawable.Drawable r12) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L20
            android.graphics.Insets r12 = r12.getOpticalInsets()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            int r1 = r12.left
            r0.left = r1
            int r1 = r12.right
            r0.right = r1
            int r1 = r12.top
            r0.top = r1
            int r12 = r12.bottom
            r0.bottom = r12
            return r0
        L20:
            java.lang.Class<?> r0 = androidx.appcompat.widget.C0271e0.f1275d
            if (r0 == 0) goto Lb4
            android.graphics.drawable.Drawable r12 = p103g0.C2200a.m5791g(r12)     // Catch: java.lang.Exception -> Lad
            java.lang.Class r0 = r12.getClass()     // Catch: java.lang.Exception -> Lad
            java.lang.String r1 = "getOpticalInsets"
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> Lad
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch: java.lang.Exception -> Lad
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> Lad
            java.lang.Object r12 = r0.invoke(r12, r1)     // Catch: java.lang.Exception -> Lad
            if (r12 == 0) goto Lb4
            android.graphics.Rect r0 = new android.graphics.Rect     // Catch: java.lang.Exception -> Lad
            r0.<init>()     // Catch: java.lang.Exception -> Lad
            java.lang.Class<?> r1 = androidx.appcompat.widget.C0271e0.f1275d     // Catch: java.lang.Exception -> Lad
            java.lang.reflect.Field[] r1 = r1.getFields()     // Catch: java.lang.Exception -> Lad
            int r3 = r1.length     // Catch: java.lang.Exception -> Lad
            r4 = 0
        L4a:
            if (r4 >= r3) goto Lac
            r5 = r1[r4]     // Catch: java.lang.Exception -> Lad
            java.lang.String r6 = r5.getName()     // Catch: java.lang.Exception -> Lad
            r7 = -1
            int r8 = r6.hashCode()     // Catch: java.lang.Exception -> Lad
            r9 = 3
            r10 = 2
            r11 = 1
            switch(r8) {
                case -1383228885: goto L7c;
                case 115029: goto L72;
                case 3317767: goto L68;
                case 108511772: goto L5e;
                default: goto L5d;
            }     // Catch: java.lang.Exception -> Lad
        L5d:
            goto L85
        L5e:
            java.lang.String r8 = "right"
            boolean r6 = r6.equals(r8)     // Catch: java.lang.Exception -> Lad
            if (r6 == 0) goto L85
            r7 = 2
            goto L85
        L68:
            java.lang.String r8 = "left"
            boolean r6 = r6.equals(r8)     // Catch: java.lang.Exception -> Lad
            if (r6 == 0) goto L85
            r7 = 0
            goto L85
        L72:
            java.lang.String r8 = "top"
            boolean r6 = r6.equals(r8)     // Catch: java.lang.Exception -> Lad
            if (r6 == 0) goto L85
            r7 = 1
            goto L85
        L7c:
            java.lang.String r8 = "bottom"
            boolean r6 = r6.equals(r8)     // Catch: java.lang.Exception -> Lad
            if (r6 == 0) goto L85
            r7 = 3
        L85:
            if (r7 == 0) goto La3
            if (r7 == r11) goto L9c
            if (r7 == r10) goto L95
            if (r7 == r9) goto L8e
            goto La9
        L8e:
            int r5 = r5.getInt(r12)     // Catch: java.lang.Exception -> Lad
            r0.bottom = r5     // Catch: java.lang.Exception -> Lad
            goto La9
        L95:
            int r5 = r5.getInt(r12)     // Catch: java.lang.Exception -> Lad
            r0.right = r5     // Catch: java.lang.Exception -> Lad
            goto La9
        L9c:
            int r5 = r5.getInt(r12)     // Catch: java.lang.Exception -> Lad
            r0.top = r5     // Catch: java.lang.Exception -> Lad
            goto La9
        La3:
            int r5 = r5.getInt(r12)     // Catch: java.lang.Exception -> Lad
            r0.left = r5     // Catch: java.lang.Exception -> Lad
        La9:
            int r4 = r4 + 1
            goto L4a
        Lac:
            return r0
        Lad:
            java.lang.String r12 = "DrawableUtils"
            java.lang.String r0 = "Couldn't obtain the optical insets. Ignoring."
            android.util.Log.e(r12, r0)
        Lb4:
            android.graphics.Rect r12 = androidx.appcompat.widget.C0271e0.f1274c
            return r12
    }

    /* renamed from: d */
    public static android.graphics.PorterDuff.Mode m710d(int r1, android.graphics.PorterDuff.Mode r2) {
            r0 = 3
            if (r1 == r0) goto L1d
            r0 = 5
            if (r1 == r0) goto L1a
            r0 = 9
            if (r1 == r0) goto L17
            switch(r1) {
                case 14: goto L14;
                case 15: goto L11;
                case 16: goto Le;
                default: goto Ld;
            }
        Ld:
            return r2
        Le:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.ADD
            return r1
        L11:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SCREEN
            return r1
        L14:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.MULTIPLY
            return r1
        L17:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_ATOP
            return r1
        L1a:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            return r1
        L1d:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_OVER
            return r1
    }
}
