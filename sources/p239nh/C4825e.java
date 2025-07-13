package p239nh;

/* renamed from: nh.e */
/* loaded from: classes.dex */
public final class C4825e {

    /* renamed from: a */
    public static final java.lang.Object[] f19224a = null;

    static {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            p239nh.C4825e.f19224a = r0
            return
    }

    /* renamed from: a */
    public static final java.lang.Object[] m10851a(java.util.Collection<?> r4) {
            int r0 = r4.size()
            if (r0 != 0) goto L7
            goto L11
        L7:
            java.util.Iterator r4 = r4.iterator()
            boolean r1 = r4.hasNext()
            if (r1 != 0) goto L14
        L11:
            java.lang.Object[] r4 = p239nh.C4825e.f19224a
            goto L5a
        L14:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
        L17:
            int r2 = r1 + 1
            java.lang.Object r3 = r4.next()
            r0[r1] = r3
            int r1 = r0.length
            if (r2 < r1) goto L4b
            boolean r1 = r4.hasNext()
            if (r1 != 0) goto L2a
            r4 = r0
            goto L5a
        L2a:
            int r1 = r2 * 3
            int r1 = r1 + 1
            int r1 = r1 >>> 1
            r3 = 2147483645(0x7ffffffd, float:NaN)
            if (r1 > r2) goto L41
            if (r2 >= r3) goto L3b
            r1 = 2147483645(0x7ffffffd, float:NaN)
            goto L41
        L3b:
            java.lang.OutOfMemoryError r4 = new java.lang.OutOfMemoryError
            r4.<init>()
            throw r4
        L41:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r1 = "copyOf(result, newSize)"
            p214m2.C4339q.m9705j(r0, r1)
            goto L5b
        L4b:
            boolean r1 = r4.hasNext()
            if (r1 != 0) goto L5b
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r0, r2)
            java.lang.String r0 = "copyOf(result, size)"
            p214m2.C4339q.m9705j(r4, r0)
        L5a:
            return r4
        L5b:
            r1 = r2
            goto L17
    }

    /* renamed from: b */
    public static final java.lang.Object[] m10852b(java.util.Collection<?> r5, java.lang.Object[] r6) {
            int r0 = r5.size()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto Lf
            int r5 = r6.length
            if (r5 <= 0) goto L7f
            r6[r2] = r1
            goto L7f
        Lf:
            java.util.Iterator r5 = r5.iterator()
            boolean r3 = r5.hasNext()
            if (r3 != 0) goto L1f
            int r5 = r6.length
            if (r5 <= 0) goto L7f
            r6[r2] = r1
            goto L7f
        L1f:
            int r3 = r6.length
            if (r0 > r3) goto L24
            r0 = r6
            goto L37
        L24:
            java.lang.Class r3 = r6.getClass()
            java.lang.Class r3 = r3.getComponentType()
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r3, r0)
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"
            java.util.Objects.requireNonNull(r0, r3)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
        L37:
            int r3 = r2 + 1
            java.lang.Object r4 = r5.next()
            r0[r2] = r4
            int r2 = r0.length
            if (r3 < r2) goto L6b
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L4a
            r6 = r0
            goto L7f
        L4a:
            int r2 = r3 * 3
            int r2 = r2 + 1
            int r2 = r2 >>> 1
            r4 = 2147483645(0x7ffffffd, float:NaN)
            if (r2 > r3) goto L61
            if (r3 >= r4) goto L5b
            r2 = 2147483645(0x7ffffffd, float:NaN)
            goto L61
        L5b:
            java.lang.OutOfMemoryError r5 = new java.lang.OutOfMemoryError
            r5.<init>()
            throw r5
        L61:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            java.lang.String r2 = "copyOf(result, newSize)"
            p214m2.C4339q.m9705j(r0, r2)
            goto L80
        L6b:
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L80
            if (r0 != r6) goto L76
            r6[r3] = r1
            goto L7f
        L76:
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r0, r3)
            java.lang.String r5 = "copyOf(result, size)"
            p214m2.C4339q.m9705j(r6, r5)
        L7f:
            return r6
        L80:
            r2 = r3
            goto L37
    }
}
