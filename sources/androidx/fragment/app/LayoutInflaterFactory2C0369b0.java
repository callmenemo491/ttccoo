package androidx.fragment.app;

/* renamed from: androidx.fragment.app.b0 */
/* loaded from: classes.dex */
public class LayoutInflaterFactory2C0369b0 implements android.view.LayoutInflater.Factory2 {

    /* renamed from: Y */
    public final androidx.fragment.app.AbstractC0375d0 f2053Y;

    /* renamed from: androidx.fragment.app.b0$a */
    public class a implements android.view.View.OnAttachStateChangeListener {

        /* renamed from: Y */
        public final /* synthetic */ androidx.fragment.app.C0388j0 f2054Y;

        /* renamed from: Z */
        public final /* synthetic */ androidx.fragment.app.LayoutInflaterFactory2C0369b0 f2055Z;

        public a(androidx.fragment.app.LayoutInflaterFactory2C0369b0 r1, androidx.fragment.app.C0388j0 r2) {
                r0 = this;
                r0.f2055Z = r1
                r0.f2054Y = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(android.view.View r2) {
                r1 = this;
                androidx.fragment.app.j0 r2 = r1.f2054Y
                androidx.fragment.app.n r0 = r2.f2202c
                r2.m1214k()
                android.view.View r2 = r0.f2260C0
                android.view.ViewParent r2 = r2.getParent()
                android.view.ViewGroup r2 = (android.view.ViewGroup) r2
                androidx.fragment.app.b0 r0 = r1.f2055Z
                androidx.fragment.app.d0 r0 = r0.f2053Y
                androidx.fragment.app.b1 r2 = androidx.fragment.app.AbstractC0370b1.m1093f(r2, r0)
                r2.m1099e()
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(android.view.View r1) {
                r0 = this;
                return
        }
    }

    public LayoutInflaterFactory2C0369b0(androidx.fragment.app.AbstractC0375d0 r1) {
            r0 = this;
            r0.<init>()
            r0.f2053Y = r1
            return
    }

    @Override // android.view.LayoutInflater.Factory2
    public android.view.View onCreateView(android.view.View r10, java.lang.String r11, android.content.Context r12, android.util.AttributeSet r13) {
            r9 = this;
            java.lang.Class<androidx.fragment.app.FragmentContainerView> r0 = androidx.fragment.app.FragmentContainerView.class
            java.lang.String r0 = r0.getName()
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentContainerView r10 = new androidx.fragment.app.FragmentContainerView
            androidx.fragment.app.d0 r11 = r9.f2053Y
            r10.<init>(r12, r13, r11)
            return r10
        L14:
            java.lang.String r0 = "fragment"
            boolean r11 = r0.equals(r11)
            r0 = 0
            if (r11 != 0) goto L1e
            return r0
        L1e:
            java.lang.String r11 = "class"
            java.lang.String r11 = r13.getAttributeValue(r0, r11)
            int[] r1 = p402x0.C6909a.f26864a
            android.content.res.TypedArray r1 = r12.obtainStyledAttributes(r13, r1)
            r2 = 0
            if (r11 != 0) goto L31
            java.lang.String r11 = r1.getString(r2)
        L31:
            r3 = 1
            r4 = -1
            int r5 = r1.getResourceId(r3, r4)
            r6 = 2
            java.lang.String r7 = r1.getString(r6)
            r1.recycle()
            if (r11 == 0) goto L1a2
            java.lang.ClassLoader r1 = r12.getClassLoader()
            s.h<java.lang.ClassLoader, s.h<java.lang.String, java.lang.Class<?>>> r8 = androidx.fragment.app.C0419z.f2424a
            java.lang.Class r1 = androidx.fragment.app.C0419z.m1402b(r1, r11)     // Catch: java.lang.ClassNotFoundException -> L52
            java.lang.Class<androidx.fragment.app.n> r8 = androidx.fragment.app.ComponentCallbacksC0395n.class
            boolean r1 = r8.isAssignableFrom(r1)     // Catch: java.lang.ClassNotFoundException -> L52
            goto L53
        L52:
            r1 = 0
        L53:
            if (r1 != 0) goto L57
            goto L1a2
        L57:
            if (r10 == 0) goto L5d
            int r2 = r10.getId()
        L5d:
            if (r2 != r4) goto L82
            if (r5 != r4) goto L82
            if (r7 == 0) goto L64
            goto L82
        L64:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = r13.getPositionDescription()
            r12.append(r13)
            java.lang.String r13 = ": Must specify unique android:id, android:tag, or have a parent with an id for "
            r12.append(r13)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r10.<init>(r11)
            throw r10
        L82:
            if (r5 == r4) goto L8a
            androidx.fragment.app.d0 r0 = r9.f2053Y
            androidx.fragment.app.n r0 = r0.m1139H(r5)
        L8a:
            if (r0 != 0) goto L94
            if (r7 == 0) goto L94
            androidx.fragment.app.d0 r0 = r9.f2053Y
            androidx.fragment.app.n r0 = r0.m1140I(r7)
        L94:
            if (r0 != 0) goto L9e
            if (r2 == r4) goto L9e
            androidx.fragment.app.d0 r0 = r9.f2053Y
            androidx.fragment.app.n r0 = r0.m1139H(r2)
        L9e:
            java.lang.String r1 = "Fragment "
            java.lang.String r4 = "FragmentManager"
            if (r0 != 0) goto Lea
            androidx.fragment.app.d0 r0 = r9.f2053Y
            androidx.fragment.app.z r0 = r0.m1142K()
            java.lang.ClassLoader r12 = r12.getClassLoader()
            androidx.fragment.app.n r0 = r0.mo1196a(r12, r11)
            r0.f2289k0 = r3
            if (r5 == 0) goto Lb8
            r12 = r5
            goto Lb9
        Lb8:
            r12 = r2
        Lb9:
            r0.f2298t0 = r12
            r0.f2299u0 = r2
            r0.f2300v0 = r7
            r0.f2290l0 = r3
            androidx.fragment.app.d0 r12 = r9.f2053Y
            r0.f2294p0 = r12
            androidx.fragment.app.a0<?> r12 = r12.f2130r
            r0.f2295q0 = r12
            android.content.Context r12 = r12.f2034Z
            android.os.Bundle r2 = r0.f2278Z
            r0.mo1319b0(r12, r13, r2)
            androidx.fragment.app.d0 r12 = r9.f2053Y
            androidx.fragment.app.j0 r12 = r12.m1157a(r0)
            boolean r13 = androidx.fragment.app.AbstractC0375d0.m1131O(r6)
            if (r13 == 0) goto L12b
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r1)
            r13.append(r0)
            java.lang.String r2 = " has been inflated via the <fragment> tag: id=0x"
            goto L11a
        Lea:
            boolean r12 = r0.f2290l0
            if (r12 != 0) goto L164
            r0.f2290l0 = r3
            androidx.fragment.app.d0 r12 = r9.f2053Y
            r0.f2294p0 = r12
            androidx.fragment.app.a0<?> r12 = r12.f2130r
            r0.f2295q0 = r12
            android.content.Context r12 = r12.f2034Z
            android.os.Bundle r2 = r0.f2278Z
            r0.mo1319b0(r12, r13, r2)
            androidx.fragment.app.d0 r12 = r9.f2053Y
            androidx.fragment.app.j0 r12 = r12.m1171h(r0)
            boolean r13 = androidx.fragment.app.AbstractC0375d0.m1131O(r6)
            if (r13 == 0) goto L12b
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r2 = "Retained Fragment "
            r13.append(r2)
            r13.append(r0)
            java.lang.String r2 = " has been re-attached via the <fragment> tag: id=0x"
        L11a:
            r13.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r5)
            r13.append(r2)
            java.lang.String r13 = r13.toString()
            android.util.Log.v(r4, r13)
        L12b:
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            r0.f2259B0 = r10
            r12.m1214k()
            r12.m1213j()
            android.view.View r10 = r0.f2260C0
            if (r10 == 0) goto L158
            if (r5 == 0) goto L13e
            r10.setId(r5)
        L13e:
            android.view.View r10 = r0.f2260C0
            java.lang.Object r10 = r10.getTag()
            if (r10 != 0) goto L14b
            android.view.View r10 = r0.f2260C0
            r10.setTag(r7)
        L14b:
            android.view.View r10 = r0.f2260C0
            androidx.fragment.app.b0$a r11 = new androidx.fragment.app.b0$a
            r11.<init>(r9, r12)
            r10.addOnAttachStateChangeListener(r11)
            android.view.View r10 = r0.f2260C0
            return r10
        L158:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r12 = " did not create a view."
            java.lang.String r11 = android.support.v4.media.C0145d.m257a(r1, r11, r12)
            r10.<init>(r11)
            throw r10
        L164:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = r13.getPositionDescription()
            r12.append(r13)
            java.lang.String r13 = ": Duplicate id 0x"
            r12.append(r13)
            java.lang.String r13 = java.lang.Integer.toHexString(r5)
            r12.append(r13)
            java.lang.String r13 = ", tag "
            r12.append(r13)
            r12.append(r7)
            java.lang.String r13 = ", or parent id 0x"
            r12.append(r13)
            java.lang.String r13 = java.lang.Integer.toHexString(r2)
            r12.append(r13)
            java.lang.String r13 = " with another fragment for "
            r12.append(r13)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r10.<init>(r11)
            throw r10
        L1a2:
            return r0
    }

    @Override // android.view.LayoutInflater.Factory
    public android.view.View onCreateView(java.lang.String r2, android.content.Context r3, android.util.AttributeSet r4) {
            r1 = this;
            r0 = 0
            android.view.View r2 = r1.onCreateView(r0, r2, r3, r4)
            return r2
    }
}
