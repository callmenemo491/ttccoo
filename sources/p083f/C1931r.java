package p083f;

/* renamed from: f.r */
/* loaded from: classes.dex */
public class C1931r {

    /* renamed from: b */
    public static final java.lang.Class<?>[] f8415b = null;

    /* renamed from: c */
    public static final int[] f8416c = null;

    /* renamed from: d */
    public static final java.lang.String[] f8417d = null;

    /* renamed from: e */
    public static final p319s.C5941h<java.lang.String, java.lang.reflect.Constructor<? extends android.view.View>> f8418e = null;

    /* renamed from: a */
    public final java.lang.Object[] f8419a;

    /* renamed from: f.r$a */
    public static class a implements android.view.View.OnClickListener {

        /* renamed from: Y */
        public final android.view.View f8420Y;

        /* renamed from: Z */
        public final java.lang.String f8421Z;

        /* renamed from: a0 */
        public java.lang.reflect.Method f8422a0;

        /* renamed from: b0 */
        public android.content.Context f8423b0;

        public a(android.view.View r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.f8420Y = r1
                r0.f8421Z = r2
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r8) {
                r7 = this;
                java.lang.reflect.Method r0 = r7.f8422a0
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L8b
                android.view.View r0 = r7.f8420Y
                android.content.Context r0 = r0.getContext()
            Lc:
                if (r0 == 0) goto L39
                boolean r3 = r0.isRestricted()     // Catch: java.lang.NoSuchMethodException -> L2b
                if (r3 != 0) goto L2c
                java.lang.Class r3 = r0.getClass()     // Catch: java.lang.NoSuchMethodException -> L2b
                java.lang.String r4 = r7.f8421Z     // Catch: java.lang.NoSuchMethodException -> L2b
                java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L2b
                java.lang.Class<android.view.View> r6 = android.view.View.class
                r5[r1] = r6     // Catch: java.lang.NoSuchMethodException -> L2b
                java.lang.reflect.Method r3 = r3.getMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L2b
                if (r3 == 0) goto L2c
                r7.f8422a0 = r3     // Catch: java.lang.NoSuchMethodException -> L2b
                r7.f8423b0 = r0     // Catch: java.lang.NoSuchMethodException -> L2b
                goto L8b
            L2b:
            L2c:
                boolean r3 = r0 instanceof android.content.ContextWrapper
                if (r3 == 0) goto L37
                android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
                android.content.Context r0 = r0.getBaseContext()
                goto Lc
            L37:
                r0 = 0
                goto Lc
            L39:
                android.view.View r8 = r7.f8420Y
                int r8 = r8.getId()
                r0 = -1
                if (r8 != r0) goto L45
                java.lang.String r8 = ""
                goto L65
            L45:
                java.lang.String r0 = " with id '"
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                android.view.View r1 = r7.f8420Y
                android.content.Context r1 = r1.getContext()
                android.content.res.Resources r1 = r1.getResources()
                java.lang.String r8 = r1.getResourceEntryName(r8)
                r0.append(r8)
                java.lang.String r8 = "'"
                r0.append(r8)
                java.lang.String r8 = r0.toString()
            L65:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Could not find method "
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
                java.lang.String r2 = r7.f8421Z
                r1.append(r2)
                java.lang.String r2 = "(View) in a parent or ancestor Context for android:onClick attribute defined on view "
                r1.append(r2)
                android.view.View r2 = r7.f8420Y
                java.lang.Class r2 = r2.getClass()
                r1.append(r2)
                r1.append(r8)
                java.lang.String r8 = r1.toString()
                r0.<init>(r8)
                throw r0
            L8b:
                java.lang.reflect.Method r0 = r7.f8422a0     // Catch: java.lang.reflect.InvocationTargetException -> L97 java.lang.IllegalAccessException -> La0
                android.content.Context r3 = r7.f8423b0     // Catch: java.lang.reflect.InvocationTargetException -> L97 java.lang.IllegalAccessException -> La0
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L97 java.lang.IllegalAccessException -> La0
                r2[r1] = r8     // Catch: java.lang.reflect.InvocationTargetException -> L97 java.lang.IllegalAccessException -> La0
                r0.invoke(r3, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L97 java.lang.IllegalAccessException -> La0
                return
            L97:
                r8 = move-exception
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Could not execute method for android:onClick"
                r0.<init>(r1, r8)
                throw r0
            La0:
                r8 = move-exception
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Could not execute non-public method for android:onClick"
                r0.<init>(r1, r8)
                throw r0
        }
    }

    static {
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r2 = 0
            r0[r2] = r1
            java.lang.Class<android.util.AttributeSet> r1 = android.util.AttributeSet.class
            r3 = 1
            r0[r3] = r1
            p083f.C1931r.f8415b = r0
            int[] r0 = new int[r3]
            r1 = 16843375(0x101026f, float:2.3695304E-38)
            r0[r2] = r1
            p083f.C1931r.f8416c = r0
            java.lang.String r0 = "android.widget."
            java.lang.String r1 = "android.view."
            java.lang.String r2 = "android.webkit."
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2}
            p083f.C1931r.f8417d = r0
            s.h r0 = new s.h
            r0.<init>()
            p083f.C1931r.f8418e = r0
            return
    }

    public C1931r() {
            r1 = this;
            r1.<init>()
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1.f8419a = r0
            return
    }

    /* renamed from: a */
    public androidx.appcompat.widget.C0270e mo3601a(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.appcompat.widget.e r0 = new androidx.appcompat.widget.e
            r0.<init>(r2, r3)
            return r0
    }

    /* renamed from: b */
    public androidx.appcompat.widget.C0276g mo3602b(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.appcompat.widget.g r0 = new androidx.appcompat.widget.g
            r0.<init>(r2, r3)
            return r0
    }

    /* renamed from: c */
    public androidx.appcompat.widget.C0279h mo3603c(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.appcompat.widget.h r0 = new androidx.appcompat.widget.h
            r0.<init>(r2, r3)
            return r0
    }

    /* renamed from: d */
    public androidx.appcompat.widget.C0299r mo3604d(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            androidx.appcompat.widget.r r0 = new androidx.appcompat.widget.r
            r1 = 2130969390(0x7f04032e, float:1.754746E38)
            r0.<init>(r3, r4, r1)
            return r0
    }

    /* renamed from: e */
    public androidx.appcompat.widget.AppCompatTextView mo3605e(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextView r0 = new androidx.appcompat.widget.AppCompatTextView
            r0.<init>(r2, r3)
            return r0
    }

    /* renamed from: f */
    public final android.view.View m4772f(android.content.Context r4, java.lang.String r5, java.lang.String r6) {
            r3 = this;
            s.h<java.lang.String, java.lang.reflect.Constructor<? extends android.view.View>> r0 = p083f.C1931r.f8418e
            r1 = 0
            java.lang.Object r2 = r0.getOrDefault(r5, r1)
            java.lang.reflect.Constructor r2 = (java.lang.reflect.Constructor) r2
            if (r2 != 0) goto L36
            if (r6 == 0) goto L1d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L43
            r2.<init>()     // Catch: java.lang.Exception -> L43
            r2.append(r6)     // Catch: java.lang.Exception -> L43
            r2.append(r5)     // Catch: java.lang.Exception -> L43
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Exception -> L43
            goto L1e
        L1d:
            r6 = r5
        L1e:
            r2 = 0
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch: java.lang.Exception -> L43
            java.lang.Class r4 = java.lang.Class.forName(r6, r2, r4)     // Catch: java.lang.Exception -> L43
            java.lang.Class<android.view.View> r6 = android.view.View.class
            java.lang.Class r4 = r4.asSubclass(r6)     // Catch: java.lang.Exception -> L43
            java.lang.Class<?>[] r6 = p083f.C1931r.f8415b     // Catch: java.lang.Exception -> L43
            java.lang.reflect.Constructor r2 = r4.getConstructor(r6)     // Catch: java.lang.Exception -> L43
            r0.put(r5, r2)     // Catch: java.lang.Exception -> L43
        L36:
            r4 = 1
            r2.setAccessible(r4)     // Catch: java.lang.Exception -> L43
            java.lang.Object[] r4 = r3.f8419a     // Catch: java.lang.Exception -> L43
            java.lang.Object r4 = r2.newInstance(r4)     // Catch: java.lang.Exception -> L43
            android.view.View r4 = (android.view.View) r4     // Catch: java.lang.Exception -> L43
            return r4
        L43:
            return r1
    }

    /* renamed from: g */
    public final void m4773g(android.view.View r3, java.lang.String r4) {
            r2 = this;
            if (r3 == 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = " asked to inflate view for <"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = ">, but returned null"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
    }
}
