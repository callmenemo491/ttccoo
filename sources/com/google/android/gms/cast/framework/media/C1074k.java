package com.google.android.gms.cast.framework.media;

/* renamed from: com.google.android.gms.cast.framework.media.k */
/* loaded from: classes.dex */
public final class C1074k extends com.google.android.gms.cast.framework.media.C1065b.a {

    /* renamed from: a */
    public final /* synthetic */ com.google.android.gms.cast.framework.media.C1064a f5512a;

    public C1074k(com.google.android.gms.cast.framework.media.C1064a r1) {
            r0 = this;
            r0.f5512a = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.cast.framework.media.C1065b.a
    /* renamed from: m */
    public final void mo2879m() {
            r6 = this;
            com.google.android.gms.cast.framework.media.a r0 = r6.f5512a
            long r0 = r0.m2989e()
            com.google.android.gms.cast.framework.media.a r2 = r6.f5512a
            long r3 = r2.f5475b
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L20
            r2.f5475b = r0
            r2.m2987c()
            com.google.android.gms.cast.framework.media.a r0 = r6.f5512a
            long r1 = r0.f5475b
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L20
            r0.m2988d()
        L20:
            return
    }

    @Override // com.google.android.gms.cast.framework.media.C1065b.a
    /* renamed from: o */
    public final void mo3017o(int[] r2) {
            r1 = this;
            java.util.List r2 = p123h6.C2487a.m6367f(r2)
            com.google.android.gms.cast.framework.media.a r0 = r1.f5512a
            java.util.List<java.lang.Integer> r0 = r0.f5477d
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lf
            return
        Lf:
            com.google.android.gms.cast.framework.media.a r0 = r1.f5512a
            r0.m2992h()
            com.google.android.gms.cast.framework.media.a r0 = r1.f5512a
            android.util.LruCache<java.lang.Integer, c6.n> r0 = r0.f5479f
            r0.evictAll()
            com.google.android.gms.cast.framework.media.a r0 = r1.f5512a
            java.util.List<java.lang.Integer> r0 = r0.f5480g
            r0.clear()
            com.google.android.gms.cast.framework.media.a r0 = r1.f5512a
            r0.f5477d = r2
            com.google.android.gms.cast.framework.media.C1064a.m2986b(r0)
            com.google.android.gms.cast.framework.media.a r2 = r1.f5512a
            r2.m2991g()
            com.google.android.gms.cast.framework.media.a r2 = r1.f5512a
            r2.m2990f()
            return
    }

    @Override // com.google.android.gms.cast.framework.media.C1065b.a
    /* renamed from: p */
    public final void mo3018p(int[] r3, int r4) {
            r2 = this;
            int r0 = r3.length
            if (r4 != 0) goto Lc
            com.google.android.gms.cast.framework.media.a r4 = r2.f5512a
            java.util.List<java.lang.Integer> r4 = r4.f5477d
            int r4 = r4.size()
            goto L1d
        Lc:
            com.google.android.gms.cast.framework.media.a r0 = r2.f5512a
            android.util.SparseIntArray r0 = r0.f5478e
            r1 = -1
            int r4 = r0.get(r4, r1)
            if (r4 != r1) goto L1d
            com.google.android.gms.cast.framework.media.a r3 = r2.f5512a
            r3.m2988d()
            return
        L1d:
            com.google.android.gms.cast.framework.media.a r0 = r2.f5512a
            r0.m2992h()
            com.google.android.gms.cast.framework.media.a r0 = r2.f5512a
            java.util.List<java.lang.Integer> r0 = r0.f5477d
            java.util.List r3 = p123h6.C2487a.m6367f(r3)
            r0.addAll(r4, r3)
            com.google.android.gms.cast.framework.media.a r3 = r2.f5512a
            com.google.android.gms.cast.framework.media.C1064a.m2986b(r3)
            com.google.android.gms.cast.framework.media.a r3 = r2.f5512a
            java.util.Set<com.google.android.gms.cast.framework.media.a$a> r3 = r3.f5486m
            java.util.Iterator r3 = r3.iterator()
        L3a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L4a
            java.lang.Object r4 = r3.next()
            com.google.android.gms.cast.framework.media.a$a r4 = (com.google.android.gms.cast.framework.media.C1064a.a) r4
            java.util.Objects.requireNonNull(r4)
            goto L3a
        L4a:
            com.google.android.gms.cast.framework.media.a r3 = r2.f5512a
            r3.m2990f()
            return
    }

    @Override // com.google.android.gms.cast.framework.media.C1065b.a
    /* renamed from: s */
    public final void mo3019s(p036c6.C0899n[] r9) {
            r8 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            com.google.android.gms.cast.framework.media.a r1 = r8.f5512a
            java.util.List<java.lang.Integer> r1 = r1.f5480g
            r1.clear()
            int r1 = r9.length
            r2 = 0
        Le:
            r3 = -1
            if (r2 >= r1) goto L3a
            r4 = r9[r2]
            int r5 = r4.f4812Z
            com.google.android.gms.cast.framework.media.a r6 = r8.f5512a
            android.util.LruCache<java.lang.Integer, c6.n> r6 = r6.f5479f
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r6.put(r7, r4)
            com.google.android.gms.cast.framework.media.a r4 = r8.f5512a
            android.util.SparseIntArray r4 = r4.f5478e
            int r4 = r4.get(r5, r3)
            if (r4 != r3) goto L30
            com.google.android.gms.cast.framework.media.a r9 = r8.f5512a
            r9.m2988d()
            return
        L30:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r0.add(r3)
            int r2 = r2 + 1
            goto Le
        L3a:
            com.google.android.gms.cast.framework.media.a r9 = r8.f5512a
            java.util.List<java.lang.Integer> r9 = r9.f5480g
            java.util.Iterator r9 = r9.iterator()
        L42:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L64
            java.lang.Object r1 = r9.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            com.google.android.gms.cast.framework.media.a r2 = r8.f5512a
            android.util.SparseIntArray r2 = r2.f5478e
            int r1 = r2.get(r1, r3)
            if (r1 == r3) goto L42
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            goto L42
        L64:
            com.google.android.gms.cast.framework.media.a r9 = r8.f5512a
            java.util.List<java.lang.Integer> r9 = r9.f5480g
            r9.clear()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r0)
            java.util.Collections.sort(r9)
            com.google.android.gms.cast.framework.media.a r0 = r8.f5512a
            r0.m2992h()
            com.google.android.gms.cast.framework.media.a r0 = r8.f5512a
            int[] r9 = p123h6.C2487a.m6369h(r9)
            com.google.android.gms.cast.framework.media.C1064a.m2985a(r0, r9)
            com.google.android.gms.cast.framework.media.a r9 = r8.f5512a
            r9.m2990f()
            return
    }

    @Override // com.google.android.gms.cast.framework.media.C1065b.a
    /* renamed from: t */
    public final void mo3020t(int[] r7) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r7.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L38
            r3 = r7[r2]
            com.google.android.gms.cast.framework.media.a r4 = r6.f5512a
            android.util.LruCache<java.lang.Integer, c6.n> r4 = r4.f5479f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r4.remove(r5)
            com.google.android.gms.cast.framework.media.a r4 = r6.f5512a
            android.util.SparseIntArray r4 = r4.f5478e
            r5 = -1
            int r4 = r4.get(r3, r5)
            if (r4 != r5) goto L27
            com.google.android.gms.cast.framework.media.a r7 = r6.f5512a
            r7.m2988d()
            return
        L27:
            com.google.android.gms.cast.framework.media.a r5 = r6.f5512a
            android.util.SparseIntArray r5 = r5.f5478e
            r5.delete(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r0.add(r3)
            int r2 = r2 + 1
            goto L7
        L38:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L3f
            return
        L3f:
            java.util.Collections.sort(r0)
            com.google.android.gms.cast.framework.media.a r1 = r6.f5512a
            r1.m2992h()
            com.google.android.gms.cast.framework.media.a r1 = r6.f5512a
            java.util.List<java.lang.Integer> r1 = r1.f5477d
            java.util.List r7 = p123h6.C2487a.m6367f(r7)
            r1.removeAll(r7)
            com.google.android.gms.cast.framework.media.a r7 = r6.f5512a
            com.google.android.gms.cast.framework.media.C1064a.m2986b(r7)
            com.google.android.gms.cast.framework.media.a r7 = r6.f5512a
            p123h6.C2487a.m6369h(r0)
            java.util.Set<com.google.android.gms.cast.framework.media.a$a> r7 = r7.f5486m
            java.util.Iterator r7 = r7.iterator()
        L62:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L72
            java.lang.Object r0 = r7.next()
            com.google.android.gms.cast.framework.media.a$a r0 = (com.google.android.gms.cast.framework.media.C1064a.a) r0
            java.util.Objects.requireNonNull(r0)
            goto L62
        L72:
            com.google.android.gms.cast.framework.media.a r7 = r6.f5512a
            r7.m2990f()
            return
    }

    @Override // com.google.android.gms.cast.framework.media.C1065b.a
    /* renamed from: u */
    public final void mo3021u(java.util.List<java.lang.Integer> r6, java.util.List<java.lang.Integer> r7, int r8) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = -1
            if (r8 != 0) goto L10
            com.google.android.gms.cast.framework.media.a r8 = r5.f5512a
            java.util.List<java.lang.Integer> r8 = r8.f5477d
            r8.size()
            goto L44
        L10:
            boolean r2 = r7.isEmpty()
            r3 = 0
            if (r2 == 0) goto L29
            com.google.android.gms.cast.framework.media.a r8 = r5.f5512a
            h6.b r8 = r8.f5474a
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r3 = r8.f11253a
            java.lang.String r4 = "Received a Queue Reordered message with an empty reordered items IDs list."
            java.lang.String r8 = r8.m6380e(r4, r2)
            android.util.Log.w(r3, r8)
            goto L44
        L29:
            com.google.android.gms.cast.framework.media.a r2 = r5.f5512a
            android.util.SparseIntArray r2 = r2.f5478e
            int r8 = r2.get(r8, r1)
            if (r8 != r1) goto L44
            com.google.android.gms.cast.framework.media.a r8 = r5.f5512a
            android.util.SparseIntArray r8 = r8.f5478e
            java.lang.Object r2 = r7.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r8.get(r2, r1)
        L44:
            java.util.Iterator r7 = r7.iterator()
        L48:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L70
            java.lang.Object r8 = r7.next()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            com.google.android.gms.cast.framework.media.a r2 = r5.f5512a
            android.util.SparseIntArray r2 = r2.f5478e
            int r8 = r2.get(r8, r1)
            if (r8 != r1) goto L68
            com.google.android.gms.cast.framework.media.a r6 = r5.f5512a
            r6.m2988d()
            return
        L68:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r0.add(r8)
            goto L48
        L70:
            com.google.android.gms.cast.framework.media.a r7 = r5.f5512a
            r7.m2992h()
            com.google.android.gms.cast.framework.media.a r7 = r5.f5512a
            r7.f5477d = r6
            com.google.android.gms.cast.framework.media.C1064a.m2986b(r7)
            com.google.android.gms.cast.framework.media.a r6 = r5.f5512a
            java.util.Set<com.google.android.gms.cast.framework.media.a$a> r6 = r6.f5486m
            java.util.Iterator r6 = r6.iterator()
        L84:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L94
            java.lang.Object r7 = r6.next()
            com.google.android.gms.cast.framework.media.a$a r7 = (com.google.android.gms.cast.framework.media.C1064a.a) r7
            java.util.Objects.requireNonNull(r7)
            goto L84
        L94:
            com.google.android.gms.cast.framework.media.a r6 = r5.f5512a
            r6.m2990f()
            return
    }

    @Override // com.google.android.gms.cast.framework.media.C1065b.a
    /* renamed from: v */
    public final void mo3022v(int[] r7) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r7.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L31
            r3 = r7[r2]
            com.google.android.gms.cast.framework.media.a r4 = r6.f5512a
            android.util.LruCache<java.lang.Integer, c6.n> r4 = r4.f5479f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r4.remove(r5)
            com.google.android.gms.cast.framework.media.a r4 = r6.f5512a
            android.util.SparseIntArray r4 = r4.f5478e
            r5 = -1
            int r3 = r4.get(r3, r5)
            if (r3 != r5) goto L27
            com.google.android.gms.cast.framework.media.a r7 = r6.f5512a
            r7.m2988d()
            return
        L27:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.add(r3)
            int r2 = r2 + 1
            goto L7
        L31:
            java.util.Collections.sort(r0)
            com.google.android.gms.cast.framework.media.a r7 = r6.f5512a
            r7.m2992h()
            com.google.android.gms.cast.framework.media.a r7 = r6.f5512a
            int[] r0 = p123h6.C2487a.m6369h(r0)
            com.google.android.gms.cast.framework.media.C1064a.m2985a(r7, r0)
            com.google.android.gms.cast.framework.media.a r7 = r6.f5512a
            r7.m2990f()
            return
    }

    @Override // com.google.android.gms.cast.framework.media.C1065b.a
    /* renamed from: w */
    public final void mo3023w() {
            r1 = this;
            com.google.android.gms.cast.framework.media.a r0 = r1.f5512a
            r0.m2988d()
            return
    }
}
