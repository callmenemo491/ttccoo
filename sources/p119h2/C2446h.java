package p119h2;

/* renamed from: h2.h */
/* loaded from: classes.dex */
public final class C2446h {

    /* renamed from: h2.h$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: h2.h$b */
    public static class b {

        /* renamed from: a */
        public final java.lang.String f10942a;

        /* renamed from: b */
        public final p105g2.C2226t f10943b;

        public b(java.lang.String r1, p105g2.C2226t r2, p119h2.C2446h.a r3) {
                r0 = this;
                r0.<init>()
                r0.f10942a = r1
                r0.f10943b = r2
                return
        }
    }

    /* renamed from: a */
    public static p105g2.C2218l m6221a(p105g2.AbstractC2220n<?> r10, long r11, java.util.List<p105g2.C2214h> r13) {
            g2.b$a r10 = r10.f10152k0
            if (r10 != 0) goto L11
            g2.l r10 = new g2.l
            r1 = 304(0x130, float:4.26E-43)
            r2 = 0
            r3 = 1
            r0 = r10
            r4 = r11
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r6)
            return r10
        L11:
            java.util.TreeSet r0 = new java.util.TreeSet
            java.util.Comparator r1 = java.lang.String.CASE_INSENSITIVE_ORDER
            r0.<init>(r1)
            boolean r1 = r13.isEmpty()
            if (r1 != 0) goto L34
            java.util.Iterator r1 = r13.iterator()
        L22:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r1.next()
            g2.h r2 = (p105g2.C2214h) r2
            java.lang.String r2 = r2.f10128a
            r0.add(r2)
            goto L22
        L34:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r13)
            java.util.List<g2.h> r13 = r10.f10111h
            if (r13 == 0) goto L61
            boolean r13 = r13.isEmpty()
            if (r13 != 0) goto L9e
            java.util.List<g2.h> r13 = r10.f10111h
            java.util.Iterator r13 = r13.iterator()
        L49:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L9e
            java.lang.Object r1 = r13.next()
            g2.h r1 = (p105g2.C2214h) r1
            java.lang.String r2 = r1.f10128a
            boolean r2 = r0.contains(r2)
            if (r2 != 0) goto L49
            r9.add(r1)
            goto L49
        L61:
            java.util.Map<java.lang.String, java.lang.String> r13 = r10.f10110g
            boolean r13 = r13.isEmpty()
            if (r13 != 0) goto L9e
            java.util.Map<java.lang.String, java.lang.String> r13 = r10.f10110g
            java.util.Set r13 = r13.entrySet()
            java.util.Iterator r13 = r13.iterator()
        L73:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L9e
            java.lang.Object r1 = r13.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            boolean r2 = r0.contains(r2)
            if (r2 != 0) goto L73
            g2.h r2 = new g2.h
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r2.<init>(r3, r1)
            r9.add(r2)
            goto L73
        L9e:
            g2.l r13 = new g2.l
            r4 = 304(0x130, float:4.26E-43)
            byte[] r5 = r10.f10104a
            r6 = 1
            r3 = r13
            r7 = r11
            r3.<init>(r4, r5, r6, r7, r9)
            return r13
    }

    /* renamed from: b */
    public static byte[] m6222b(java.io.InputStream r5, int r6, p119h2.C2441c r7) {
            java.lang.String r0 = "Error occurred when closing InputStream"
            h2.i r1 = new h2.i
            r1.<init>(r7, r6)
            r6 = 1024(0x400, float:1.435E-42)
            r2 = 0
            byte[] r6 = r7.m6192a(r6)     // Catch: java.lang.Throwable -> L2f
        Le:
            int r3 = r5.read(r6)     // Catch: java.lang.Throwable -> L2d
            r4 = -1
            if (r3 == r4) goto L19
            r1.write(r6, r2, r3)     // Catch: java.lang.Throwable -> L2d
            goto Le
        L19:
            byte[] r3 = r1.toByteArray()     // Catch: java.lang.Throwable -> L2d
            r5.close()     // Catch: java.io.IOException -> L21
            goto L26
        L21:
            java.lang.Object[] r5 = new java.lang.Object[r2]
            p105g2.C2227u.m5822d(r0, r5)
        L26:
            r7.m6193b(r6)
            r1.close()
            return r3
        L2d:
            r3 = move-exception
            goto L31
        L2f:
            r3 = move-exception
            r6 = 0
        L31:
            r5.close()     // Catch: java.io.IOException -> L35
            goto L3a
        L35:
            java.lang.Object[] r5 = new java.lang.Object[r2]
            p105g2.C2227u.m5822d(r0, r5)
        L3a:
            r7.m6193b(r6)
            r1.close()
            throw r3
    }

    /* renamed from: c */
    public static void m6223c(long r3, p105g2.AbstractC2220n<?> r5, byte[] r6, int r7) {
            boolean r0 = p105g2.C2227u.f10176a
            if (r0 != 0) goto La
            r0 = 3000(0xbb8, double:1.482E-320)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto L3b
        La:
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r5
            r1 = 1
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0[r1] = r3
            r3 = 2
            if (r6 == 0) goto L20
            int r4 = r6.length
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L22
        L20:
            java.lang.String r4 = "null"
        L22:
            r0[r3] = r4
            r3 = 3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r0[r3] = r4
            r3 = 4
            g2.f r4 = r5.f10151j0
            int r4 = r4.f10122b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0[r3] = r4
            java.lang.String r3 = "HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]"
            p105g2.C2227u.m5820b(r3, r0)
        L3b:
            return
    }
}
