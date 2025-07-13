package p105g2;

/* renamed from: g2.l */
/* loaded from: classes.dex */
public class C2218l {

    /* renamed from: a */
    public final int f10135a;

    /* renamed from: b */
    public final byte[] f10136b;

    /* renamed from: c */
    public final java.util.Map<java.lang.String, java.lang.String> f10137c;

    /* renamed from: d */
    public final java.util.List<p105g2.C2214h> f10138d;

    /* renamed from: e */
    public final boolean f10139e;

    public C2218l(int r1, byte[] r2, java.util.Map<java.lang.String, java.lang.String> r3, java.util.List<p105g2.C2214h> r4, boolean r5, long r6) {
            r0 = this;
            r0.<init>()
            r0.f10135a = r1
            r0.f10136b = r2
            r0.f10137c = r3
            if (r4 != 0) goto Ld
            r1 = 0
            goto L11
        Ld:
            java.util.List r1 = java.util.Collections.unmodifiableList(r4)
        L11:
            r0.f10138d = r1
            r0.f10139e = r5
            return
    }

    public C2218l(int r9, byte[] r10, boolean r11, long r12, java.util.List<p105g2.C2214h> r14) {
            r8 = this;
            if (r14 != 0) goto L5
            r0 = 0
        L3:
            r3 = r0
            goto L2f
        L5:
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto L10
            java.util.Map r0 = java.util.Collections.emptyMap()
            goto L3
        L10:
            java.util.TreeMap r0 = new java.util.TreeMap
            java.util.Comparator r1 = java.lang.String.CASE_INSENSITIVE_ORDER
            r0.<init>(r1)
            java.util.Iterator r1 = r14.iterator()
        L1b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3
            java.lang.Object r2 = r1.next()
            g2.h r2 = (p105g2.C2214h) r2
            java.lang.String r3 = r2.f10128a
            java.lang.String r2 = r2.f10129b
            r0.put(r3, r2)
            goto L1b
        L2f:
            r0 = r8
            r1 = r9
            r2 = r10
            r4 = r14
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    @java.lang.Deprecated
    public C2218l(byte[] r14, java.util.Map<java.lang.String, java.lang.String> r15) {
            r13 = this;
            if (r15 != 0) goto L5
            r0 = 0
        L3:
            r9 = r0
            goto L42
        L5:
            boolean r0 = r15.isEmpty()
            if (r0 == 0) goto L10
            java.util.List r0 = java.util.Collections.emptyList()
            goto L3
        L10:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r15.size()
            r0.<init>(r1)
            java.util.Set r1 = r15.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L21:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            g2.h r3 = new g2.h
            java.lang.Object r4 = r2.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r3.<init>(r4, r2)
            r0.add(r3)
            goto L21
        L42:
            r6 = 200(0xc8, float:2.8E-43)
            r10 = 0
            r11 = 0
            r5 = r13
            r7 = r14
            r8 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return
    }
}
