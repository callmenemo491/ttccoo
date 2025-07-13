package mc;

/* renamed from: mc.b */
/* loaded from: classes.dex */
public final class C4530b {

    /* renamed from: a */
    public final java.util.Map<java.lang.Integer, java.lang.Integer> f18423a;

    public C4530b() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f18423a = r0
            return
    }

    /* renamed from: a */
    public int[] m10436a() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Map<java.lang.Integer, java.lang.Integer> r1 = r5.f18423a
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
            r2 = -1
        L10:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L4a
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getValue()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 <= r2) goto L3d
            java.lang.Object r2 = r3.getValue()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.clear()
        L35:
            java.lang.Object r3 = r3.getKey()
            r0.add(r3)
            goto L10
        L3d:
            java.lang.Object r4 = r3.getValue()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 != r2) goto L10
            goto L35
        L4a:
            int[] r0 = lc.C4262a.m9570b(r0)
            return r0
    }

    /* renamed from: b */
    public void m10437b(int r3) {
            r2 = this;
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r2.f18423a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L13
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L13:
            int r0 = r0.intValue()
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.Map<java.lang.Integer, java.lang.Integer> r1 = r2.f18423a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.put(r3, r0)
            return
    }
}
