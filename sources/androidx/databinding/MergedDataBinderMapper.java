package androidx.databinding;

/* loaded from: classes.dex */
public class MergedDataBinderMapper extends androidx.databinding.AbstractC0357d {

    /* renamed from: a */
    public java.util.Set<java.lang.Class<? extends androidx.databinding.AbstractC0357d>> f1995a;

    /* renamed from: b */
    public java.util.List<androidx.databinding.AbstractC0357d> f1996b;

    /* renamed from: c */
    public java.util.List<java.lang.String> f1997c;

    public MergedDataBinderMapper() {
            r1 = this;
            r1.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.f1995a = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.f1996b = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.f1997c = r0
            return
    }

    @Override // androidx.databinding.AbstractC0357d
    /* renamed from: b */
    public androidx.databinding.ViewDataBinding mo1043b(androidx.databinding.InterfaceC0358e r3, android.view.View r4, int r5) {
            r2 = this;
            java.util.List<androidx.databinding.d> r0 = r2.f1996b
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            androidx.databinding.d r1 = (androidx.databinding.AbstractC0357d) r1
            androidx.databinding.ViewDataBinding r1 = r1.mo1043b(r3, r4, r5)
            if (r1 == 0) goto L6
            return r1
        L19:
            boolean r0 = r2.m1046e()
            if (r0 == 0) goto L24
            androidx.databinding.ViewDataBinding r3 = r2.mo1043b(r3, r4, r5)
            return r3
        L24:
            r3 = 0
            return r3
    }

    @Override // androidx.databinding.AbstractC0357d
    /* renamed from: c */
    public androidx.databinding.ViewDataBinding mo1044c(androidx.databinding.InterfaceC0358e r3, android.view.View[] r4, int r5) {
            r2 = this;
            java.util.List<androidx.databinding.d> r0 = r2.f1996b
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            androidx.databinding.d r1 = (androidx.databinding.AbstractC0357d) r1
            androidx.databinding.ViewDataBinding r1 = r1.mo1044c(r3, r4, r5)
            if (r1 == 0) goto L6
            return r1
        L19:
            boolean r0 = r2.m1046e()
            if (r0 == 0) goto L24
            androidx.databinding.ViewDataBinding r3 = r2.mo1044c(r3, r4, r5)
            return r3
        L24:
            r3 = 0
            return r3
    }

    /* renamed from: d */
    public void m1045d(androidx.databinding.AbstractC0357d r3) {
            r2 = this;
            java.lang.Class r0 = r3.getClass()
            java.util.Set<java.lang.Class<? extends androidx.databinding.d>> r1 = r2.f1995a
            boolean r0 = r1.add(r0)
            if (r0 == 0) goto L29
            java.util.List<androidx.databinding.d> r0 = r2.f1996b
            r0.add(r3)
            java.util.List r3 = r3.mo1068a()
            java.util.Iterator r3 = r3.iterator()
        L19:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L29
            java.lang.Object r0 = r3.next()
            androidx.databinding.d r0 = (androidx.databinding.AbstractC0357d) r0
            r2.m1045d(r0)
            goto L19
        L29:
            return
    }

    /* renamed from: e */
    public final boolean m1046e() {
            r7 = this;
            java.lang.String r0 = "unable to add feature mapper for "
            java.lang.String r1 = "MergedDataBinderMapper"
            java.util.List<java.lang.String> r2 = r7.f1997c
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
        Lb:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L50
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Class r5 = java.lang.Class.forName(r4)     // Catch: java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L3a java.lang.ClassNotFoundException -> L4e
            java.lang.Class<androidx.databinding.d> r6 = androidx.databinding.AbstractC0357d.class
            boolean r6 = r6.isAssignableFrom(r5)     // Catch: java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L3a java.lang.ClassNotFoundException -> L4e
            if (r6 == 0) goto Lb
            java.lang.Object r5 = r5.newInstance()     // Catch: java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L3a java.lang.ClassNotFoundException -> L4e
            androidx.databinding.d r5 = (androidx.databinding.AbstractC0357d) r5     // Catch: java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L3a java.lang.ClassNotFoundException -> L4e
            r7.m1045d(r5)     // Catch: java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L3a java.lang.ClassNotFoundException -> L4e
            java.util.List<java.lang.String> r5 = r7.f1997c     // Catch: java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L3a java.lang.ClassNotFoundException -> L4e
            r5.remove(r4)     // Catch: java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L3a java.lang.ClassNotFoundException -> L4e
            r3 = 1
            goto Lb
        L33:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            goto L40
        L3a:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
        L40:
            r6.append(r0)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            android.util.Log.e(r1, r4, r5)
            goto Lb
        L4e:
            goto Lb
        L50:
            return r3
    }
}
