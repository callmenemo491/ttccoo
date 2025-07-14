package p102g;

@android.annotation.SuppressLint({"RestrictedAPI"})
/* renamed from: g.a */
/* loaded from: classes.dex */
public final class C2199a {

    /* renamed from: a */
    public static final java.lang.ThreadLocal<android.util.TypedValue> f10078a = null;

    /* renamed from: b */
    public static final java.util.WeakHashMap<android.content.Context, android.util.SparseArray<p102g.C2199a.a>> f10079b = null;

    /* renamed from: c */
    public static final java.lang.Object f10080c = null;

    /* renamed from: g.a$a */
    public static class a {

        /* renamed from: a */
        public final android.content.res.ColorStateList f10081a;

        /* renamed from: b */
        public final android.content.res.Configuration f10082b;

        public a(android.content.res.ColorStateList r1, android.content.res.Configuration r2) {
                r0 = this;
                r0.<init>()
                r0.f10081a = r1
                r0.f10082b = r2
                return
        }
    }

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            p102g.C2199a.f10078a = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r1 = 0
            r0.<init>(r1)
            p102g.C2199a.f10079b = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p102g.C2199a.f10080c = r0
            return
    }

    /* renamed from: a */
    public static android.content.res.ColorStateList m5783a(android.content.Context r13, int r14) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            android.content.res.ColorStateList r13 = r13.getColorStateList(r14)
            return r13
        Lb:
            java.lang.Object r0 = p102g.C2199a.f10080c
            monitor-enter(r0)
            java.util.WeakHashMap<android.content.Context, android.util.SparseArray<g.a$a>> r2 = p102g.C2199a.f10079b     // Catch: java.lang.Throwable -> L164
            java.lang.Object r2 = r2.get(r13)     // Catch: java.lang.Throwable -> L164
            android.util.SparseArray r2 = (android.util.SparseArray) r2     // Catch: java.lang.Throwable -> L164
            r3 = 0
            if (r2 == 0) goto L3e
            int r4 = r2.size()     // Catch: java.lang.Throwable -> L164
            if (r4 <= 0) goto L3e
            java.lang.Object r4 = r2.get(r14)     // Catch: java.lang.Throwable -> L164
            g.a$a r4 = (p102g.C2199a.a) r4     // Catch: java.lang.Throwable -> L164
            if (r4 == 0) goto L3e
            android.content.res.Configuration r5 = r4.f10082b     // Catch: java.lang.Throwable -> L164
            android.content.res.Resources r6 = r13.getResources()     // Catch: java.lang.Throwable -> L164
            android.content.res.Configuration r6 = r6.getConfiguration()     // Catch: java.lang.Throwable -> L164
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L164
            if (r5 == 0) goto L3b
            android.content.res.ColorStateList r2 = r4.f10081a     // Catch: java.lang.Throwable -> L164
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L164
            goto L40
        L3b:
            r2.remove(r14)     // Catch: java.lang.Throwable -> L164
        L3e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L164
            r2 = r3
        L40:
            if (r2 == 0) goto L43
            return r2
        L43:
            android.content.res.Resources r0 = r13.getResources()
            java.lang.ThreadLocal<android.util.TypedValue> r2 = p102g.C2199a.f10078a
            java.lang.Object r4 = r2.get()
            android.util.TypedValue r4 = (android.util.TypedValue) r4
            if (r4 != 0) goto L59
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            r2.set(r4)
        L59:
            r2 = 1
            r0.getValue(r14, r4, r2)
            int r0 = r4.type
            r4 = 31
            r5 = 0
            r6 = 28
            if (r0 < r6) goto L6a
            if (r0 > r4) goto L6a
            r0 = 1
            goto L6b
        L6a:
            r0 = 0
        L6b:
            if (r0 == 0) goto L6f
        L6d:
            r0 = r3
            goto L89
        L6f:
            android.content.res.Resources r0 = r13.getResources()
            android.content.res.XmlResourceParser r7 = r0.getXml(r14)
            android.content.res.Resources$Theme r8 = r13.getTheme()     // Catch: java.lang.Exception -> L80
            android.content.res.ColorStateList r0 = p065e0.C1499d.m4072a(r0, r7, r8)     // Catch: java.lang.Exception -> L80
            goto L89
        L80:
            r0 = move-exception
            java.lang.String r7 = "AppCompatResources"
            java.lang.String r8 = "Failed to inflate ColorStateList, leaving it to the framework"
            android.util.Log.e(r7, r8, r0)
            goto L6d
        L89:
            if (r0 == 0) goto Lb5
            java.lang.Object r7 = p102g.C2199a.f10080c
            monitor-enter(r7)
            java.util.WeakHashMap<android.content.Context, android.util.SparseArray<g.a$a>> r1 = p102g.C2199a.f10079b     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r2 = r1.get(r13)     // Catch: java.lang.Throwable -> Lb2
            android.util.SparseArray r2 = (android.util.SparseArray) r2     // Catch: java.lang.Throwable -> Lb2
            if (r2 != 0) goto La0
            android.util.SparseArray r2 = new android.util.SparseArray     // Catch: java.lang.Throwable -> Lb2
            r2.<init>()     // Catch: java.lang.Throwable -> Lb2
            r1.put(r13, r2)     // Catch: java.lang.Throwable -> Lb2
        La0:
            g.a$a r1 = new g.a$a     // Catch: java.lang.Throwable -> Lb2
            android.content.res.Resources r13 = r13.getResources()     // Catch: java.lang.Throwable -> Lb2
            android.content.res.Configuration r13 = r13.getConfiguration()     // Catch: java.lang.Throwable -> Lb2
            r1.<init>(r0, r13)     // Catch: java.lang.Throwable -> Lb2
            r2.append(r14, r1)     // Catch: java.lang.Throwable -> Lb2
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lb2
            return r0
        Lb2:
            r13 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lb2
            throw r13
        Lb5:
            java.lang.Object r0 = p046d0.C1259a.f6733a
            android.content.res.Resources r0 = r13.getResources()
            android.content.res.Resources$Theme r13 = r13.getTheme()
            e0.h$b r7 = new e0.h$b
            r7.<init>(r0, r13)
            java.lang.Object r8 = p065e0.C1503h.f7316c
            monitor-enter(r8)
            java.util.WeakHashMap<e0.h$b, android.util.SparseArray<e0.h$a>> r9 = p065e0.C1503h.f7315b     // Catch: java.lang.Throwable -> L161
            java.lang.Object r9 = r9.get(r7)     // Catch: java.lang.Throwable -> L161
            android.util.SparseArray r9 = (android.util.SparseArray) r9     // Catch: java.lang.Throwable -> L161
            if (r9 == 0) goto Lf2
            int r10 = r9.size()     // Catch: java.lang.Throwable -> L161
            if (r10 <= 0) goto Lf2
            java.lang.Object r10 = r9.get(r14)     // Catch: java.lang.Throwable -> L161
            e0.h$a r10 = (p065e0.C1503h.a) r10     // Catch: java.lang.Throwable -> L161
            if (r10 == 0) goto Lf2
            android.content.res.Configuration r11 = r10.f7318b     // Catch: java.lang.Throwable -> L161
            android.content.res.Configuration r12 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L161
            boolean r11 = r11.equals(r12)     // Catch: java.lang.Throwable -> L161
            if (r11 == 0) goto Lef
            android.content.res.ColorStateList r9 = r10.f7317a     // Catch: java.lang.Throwable -> L161
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L161
            goto Lf4
        Lef:
            r9.remove(r14)     // Catch: java.lang.Throwable -> L161
        Lf2:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L161
            r9 = r3
        Lf4:
            if (r9 == 0) goto Lf7
            goto L160
        Lf7:
            java.lang.ThreadLocal<android.util.TypedValue> r8 = p065e0.C1503h.f7314a
            java.lang.Object r9 = r8.get()
            android.util.TypedValue r9 = (android.util.TypedValue) r9
            if (r9 != 0) goto L109
            android.util.TypedValue r9 = new android.util.TypedValue
            r9.<init>()
            r8.set(r9)
        L109:
            r0.getValue(r14, r9, r2)
            int r8 = r9.type
            if (r8 < r6) goto L113
            if (r8 > r4) goto L113
            goto L114
        L113:
            r2 = 0
        L114:
            if (r2 == 0) goto L117
            goto L128
        L117:
            android.content.res.XmlResourceParser r2 = r0.getXml(r14)
            android.content.res.ColorStateList r3 = p065e0.C1499d.m4072a(r0, r2, r13)     // Catch: java.lang.Exception -> L120
            goto L128
        L120:
            r2 = move-exception
            java.lang.String r4 = "ResourcesCompat"
            java.lang.String r5 = "Failed to inflate ColorStateList, leaving it to the framework"
            android.util.Log.w(r4, r5, r2)
        L128:
            if (r3 == 0) goto L153
            java.lang.Object r2 = p065e0.C1503h.f7316c
            monitor-enter(r2)
            java.util.WeakHashMap<e0.h$b, android.util.SparseArray<e0.h$a>> r13 = p065e0.C1503h.f7315b     // Catch: java.lang.Throwable -> L150
            java.lang.Object r0 = r13.get(r7)     // Catch: java.lang.Throwable -> L150
            android.util.SparseArray r0 = (android.util.SparseArray) r0     // Catch: java.lang.Throwable -> L150
            if (r0 != 0) goto L13f
            android.util.SparseArray r0 = new android.util.SparseArray     // Catch: java.lang.Throwable -> L150
            r0.<init>()     // Catch: java.lang.Throwable -> L150
            r13.put(r7, r0)     // Catch: java.lang.Throwable -> L150
        L13f:
            e0.h$a r13 = new e0.h$a     // Catch: java.lang.Throwable -> L150
            android.content.res.Resources r1 = r7.f7319a     // Catch: java.lang.Throwable -> L150
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch: java.lang.Throwable -> L150
            r13.<init>(r3, r1)     // Catch: java.lang.Throwable -> L150
            r0.append(r14, r13)     // Catch: java.lang.Throwable -> L150
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L150
            r9 = r3
            goto L160
        L150:
            r13 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L150
            throw r13
        L153:
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r1) goto L15c
            android.content.res.ColorStateList r9 = r0.getColorStateList(r14, r13)
            goto L160
        L15c:
            android.content.res.ColorStateList r9 = r0.getColorStateList(r14)
        L160:
            return r9
        L161:
            r13 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L161
            throw r13
        L164:
            r13 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L164
            throw r13
    }

    /* renamed from: b */
    public static android.graphics.drawable.Drawable m5784b(android.content.Context r1, int r2) {
            androidx.appcompat.widget.m0 r0 = androidx.appcompat.widget.C0290m0.m754d()
            android.graphics.drawable.Drawable r1 = r0.m761f(r1, r2)
            return r1
    }
}
