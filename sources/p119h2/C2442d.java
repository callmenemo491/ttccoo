package p119h2;

/* renamed from: h2.d */
/* loaded from: classes.dex */
public class C2442d implements p105g2.InterfaceC2208b {

    /* renamed from: a */
    public final java.util.Map<java.lang.String, p119h2.C2442d.a> f10923a;

    /* renamed from: b */
    public long f10924b;

    /* renamed from: c */
    public final p119h2.C2442d.c f10925c;

    /* renamed from: d */
    public final int f10926d;

    /* renamed from: h2.d$a */
    public static class a {

        /* renamed from: a */
        public long f10927a;

        /* renamed from: b */
        public final java.lang.String f10928b;

        /* renamed from: c */
        public final java.lang.String f10929c;

        /* renamed from: d */
        public final long f10930d;

        /* renamed from: e */
        public final long f10931e;

        /* renamed from: f */
        public final long f10932f;

        /* renamed from: g */
        public final long f10933g;

        /* renamed from: h */
        public final java.util.List<p105g2.C2214h> f10934h;

        public a(java.lang.String r14, p105g2.InterfaceC2208b.a r15) {
                r13 = this;
                java.lang.String r2 = r15.f10105b
                long r3 = r15.f10106c
                long r5 = r15.f10107d
                long r7 = r15.f10108e
                long r9 = r15.f10109f
                java.util.List<g2.h> r0 = r15.f10111h
                if (r0 == 0) goto L10
            Le:
                r11 = r0
                goto L44
            L10:
                java.util.Map<java.lang.String, java.lang.String> r15 = r15.f10110g
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r15.size()
                r0.<init>(r1)
                java.util.Set r15 = r15.entrySet()
                java.util.Iterator r15 = r15.iterator()
            L23:
                boolean r1 = r15.hasNext()
                if (r1 == 0) goto Le
                java.lang.Object r1 = r15.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                g2.h r11 = new g2.h
                java.lang.Object r12 = r1.getKey()
                java.lang.String r12 = (java.lang.String) r12
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                r11.<init>(r12, r1)
                r0.add(r11)
                goto L23
            L44:
                r0 = r13
                r1 = r14
                r0.<init>(r1, r2, r3, r5, r7, r9, r11)
                return
        }

        public a(java.lang.String r1, java.lang.String r2, long r3, long r5, long r7, long r9, java.util.List<p105g2.C2214h> r11) {
                r0 = this;
                r0.<init>()
                r0.f10928b = r1
                java.lang.String r1 = ""
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto Le
                r2 = 0
            Le:
                r0.f10929c = r2
                r0.f10930d = r3
                r0.f10931e = r5
                r0.f10932f = r7
                r0.f10933g = r9
                r0.f10934h = r11
                return
        }

        /* renamed from: a */
        public static p119h2.C2442d.a m6210a(p119h2.C2442d.b r16) {
                int r0 = p119h2.C2442d.m6195i(r16)
                r1 = 538247942(0x20150306, float:1.2621791E-19)
                if (r0 != r1) goto L65
                java.lang.String r3 = p119h2.C2442d.m6197k(r16)
                java.lang.String r4 = p119h2.C2442d.m6197k(r16)
                long r5 = p119h2.C2442d.m6196j(r16)
                long r7 = p119h2.C2442d.m6196j(r16)
                long r9 = p119h2.C2442d.m6196j(r16)
                long r11 = p119h2.C2442d.m6196j(r16)
                int r0 = p119h2.C2442d.m6195i(r16)
                if (r0 < 0) goto L59
                if (r0 != 0) goto L2e
                java.util.List r1 = java.util.Collections.emptyList()
                goto L33
            L2e:
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
            L33:
                r13 = r1
                r1 = 0
            L35:
                if (r1 >= r0) goto L52
                java.lang.String r2 = p119h2.C2442d.m6197k(r16)
                java.lang.String r2 = r2.intern()
                java.lang.String r14 = p119h2.C2442d.m6197k(r16)
                java.lang.String r14 = r14.intern()
                g2.h r15 = new g2.h
                r15.<init>(r2, r14)
                r13.add(r15)
                int r1 = r1 + 1
                goto L35
            L52:
                h2.d$a r0 = new h2.d$a
                r2 = r0
                r2.<init>(r3, r4, r5, r7, r9, r11, r13)
                return r0
            L59:
                java.io.IOException r1 = new java.io.IOException
                java.lang.String r2 = "readHeaderList size="
                java.lang.String r0 = android.support.v4.media.C0142a.m254a(r2, r0)
                r1.<init>(r0)
                throw r1
            L65:
                java.io.IOException r0 = new java.io.IOException
                r0.<init>()
                throw r0
        }

        /* renamed from: b */
        public p105g2.InterfaceC2208b.a m6211b(byte[] r5) {
                r4 = this;
                g2.b$a r0 = new g2.b$a
                r0.<init>()
                r0.f10104a = r5
                java.lang.String r5 = r4.f10929c
                r0.f10105b = r5
                long r1 = r4.f10930d
                r0.f10106c = r1
                long r1 = r4.f10931e
                r0.f10107d = r1
                long r1 = r4.f10932f
                r0.f10108e = r1
                long r1 = r4.f10933g
                r0.f10109f = r1
                java.util.List<g2.h> r5 = r4.f10934h
                java.util.TreeMap r1 = new java.util.TreeMap
                java.util.Comparator r2 = java.lang.String.CASE_INSENSITIVE_ORDER
                r1.<init>(r2)
                java.util.Iterator r5 = r5.iterator()
            L28:
                boolean r2 = r5.hasNext()
                if (r2 == 0) goto L3c
                java.lang.Object r2 = r5.next()
                g2.h r2 = (p105g2.C2214h) r2
                java.lang.String r3 = r2.f10128a
                java.lang.String r2 = r2.f10129b
                r1.put(r3, r2)
                goto L28
            L3c:
                r0.f10110g = r1
                java.util.List<g2.h> r5 = r4.f10934h
                java.util.List r5 = java.util.Collections.unmodifiableList(r5)
                r0.f10111h = r5
                return r0
        }

        /* renamed from: c */
        public boolean m6212c(java.io.OutputStream r6) {
                r5 = this;
                r0 = 538247942(0x20150306, float:1.2621791E-19)
                r1 = 1
                r2 = 0
                p119h2.C2442d.m6199n(r6, r0)     // Catch: java.io.IOException -> L57
                java.lang.String r0 = r5.f10928b     // Catch: java.io.IOException -> L57
                p119h2.C2442d.m6201p(r6, r0)     // Catch: java.io.IOException -> L57
                java.lang.String r0 = r5.f10929c     // Catch: java.io.IOException -> L57
                if (r0 != 0) goto L13
                java.lang.String r0 = ""
            L13:
                p119h2.C2442d.m6201p(r6, r0)     // Catch: java.io.IOException -> L57
                long r3 = r5.f10930d     // Catch: java.io.IOException -> L57
                p119h2.C2442d.m6200o(r6, r3)     // Catch: java.io.IOException -> L57
                long r3 = r5.f10931e     // Catch: java.io.IOException -> L57
                p119h2.C2442d.m6200o(r6, r3)     // Catch: java.io.IOException -> L57
                long r3 = r5.f10932f     // Catch: java.io.IOException -> L57
                p119h2.C2442d.m6200o(r6, r3)     // Catch: java.io.IOException -> L57
                long r3 = r5.f10933g     // Catch: java.io.IOException -> L57
                p119h2.C2442d.m6200o(r6, r3)     // Catch: java.io.IOException -> L57
                java.util.List<g2.h> r0 = r5.f10934h     // Catch: java.io.IOException -> L57
                if (r0 == 0) goto L50
                int r3 = r0.size()     // Catch: java.io.IOException -> L57
                p119h2.C2442d.m6199n(r6, r3)     // Catch: java.io.IOException -> L57
                java.util.Iterator r0 = r0.iterator()     // Catch: java.io.IOException -> L57
            L39:
                boolean r3 = r0.hasNext()     // Catch: java.io.IOException -> L57
                if (r3 == 0) goto L53
                java.lang.Object r3 = r0.next()     // Catch: java.io.IOException -> L57
                g2.h r3 = (p105g2.C2214h) r3     // Catch: java.io.IOException -> L57
                java.lang.String r4 = r3.f10128a     // Catch: java.io.IOException -> L57
                p119h2.C2442d.m6201p(r6, r4)     // Catch: java.io.IOException -> L57
                java.lang.String r3 = r3.f10129b     // Catch: java.io.IOException -> L57
                p119h2.C2442d.m6201p(r6, r3)     // Catch: java.io.IOException -> L57
                goto L39
            L50:
                p119h2.C2442d.m6199n(r6, r2)     // Catch: java.io.IOException -> L57
            L53:
                r6.flush()     // Catch: java.io.IOException -> L57
                return r1
            L57:
                r6 = move-exception
                java.lang.Object[] r0 = new java.lang.Object[r1]
                java.lang.String r6 = r6.toString()
                r0[r2] = r6
                java.lang.String r6 = "%s"
                p105g2.C2227u.m5820b(r6, r0)
                return r2
        }
    }

    /* renamed from: h2.d$b */
    public static class b extends java.io.FilterInputStream {

        /* renamed from: Y */
        public final long f10935Y;

        /* renamed from: Z */
        public long f10936Z;

        public b(java.io.InputStream r1, long r2) {
                r0 = this;
                r0.<init>(r1)
                r0.f10935Y = r2
                return
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() {
                r5 = this;
                int r0 = super.read()
                r1 = -1
                if (r0 == r1) goto Le
                long r1 = r5.f10936Z
                r3 = 1
                long r1 = r1 + r3
                r5.f10936Z = r1
            Le:
                return r0
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] r3, int r4, int r5) {
                r2 = this;
                int r3 = super.read(r3, r4, r5)
                r4 = -1
                if (r3 == r4) goto Ld
                long r4 = r2.f10936Z
                long r0 = (long) r3
                long r4 = r4 + r0
                r2.f10936Z = r4
            Ld:
                return r3
        }
    }

    /* renamed from: h2.d$c */
    public interface c {
    }

    public C2442d(p119h2.C2442d.c r5) {
            r4 = this;
            r4.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r1 = 16
            r2 = 1061158912(0x3f400000, float:0.75)
            r3 = 1
            r0.<init>(r1, r2, r3)
            r4.f10923a = r0
            r0 = 0
            r4.f10924b = r0
            r4.f10925c = r5
            r5 = 5242880(0x500000, float:7.34684E-39)
            r4.f10926d = r5
            return
    }

    /* renamed from: h */
    public static int m6194h(java.io.InputStream r1) {
            int r1 = r1.read()
            r0 = -1
            if (r1 == r0) goto L8
            return r1
        L8:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
    }

    /* renamed from: i */
    public static int m6195i(java.io.InputStream r2) {
            int r0 = m6194h(r2)
            int r0 = r0 << 0
            r0 = r0 | 0
            int r1 = m6194h(r2)
            int r1 = r1 << 8
            r0 = r0 | r1
            int r1 = m6194h(r2)
            int r1 = r1 << 16
            r0 = r0 | r1
            int r2 = m6194h(r2)
            int r2 = r2 << 24
            r2 = r2 | r0
            return r2
    }

    /* renamed from: j */
    public static long m6196j(java.io.InputStream r7) {
            int r0 = m6194h(r7)
            long r0 = (long) r0
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            r4 = 0
            long r0 = r0 << r4
            r4 = 0
            long r0 = r0 | r4
            int r4 = m6194h(r7)
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 8
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = m6194h(r7)
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 16
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = m6194h(r7)
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 24
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = m6194h(r7)
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 32
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = m6194h(r7)
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 40
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = m6194h(r7)
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 48
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r7 = m6194h(r7)
            long r4 = (long) r7
            long r2 = r2 & r4
            r7 = 56
            long r2 = r2 << r7
            long r0 = r0 | r2
            return r0
    }

    /* renamed from: k */
    public static java.lang.String m6197k(p119h2.C2442d.b r2) {
            long r0 = m6196j(r2)
            byte[] r2 = m6198m(r2, r0)
            java.lang.String r0 = new java.lang.String
            java.lang.String r1 = "UTF-8"
            r0.<init>(r2, r1)
            return r0
    }

    /* renamed from: m */
    public static byte[] m6198m(p119h2.C2442d.b r6, long r7) {
            long r0 = r6.f10935Y
            long r2 = r6.f10936Z
            long r0 = r0 - r2
            r2 = 0
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 < 0) goto L20
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 > 0) goto L20
            int r2 = (int) r7
            long r3 = (long) r2
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 != 0) goto L20
            byte[] r7 = new byte[r2]
            java.io.DataInputStream r8 = new java.io.DataInputStream
            r8.<init>(r6)
            r8.readFully(r7)
            return r7
        L20:
            java.io.IOException r6 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "streamToBytes length="
            r2.append(r3)
            r2.append(r7)
            java.lang.String r7 = ", maxLength="
            r2.append(r7)
            r2.append(r0)
            java.lang.String r7 = r2.toString()
            r6.<init>(r7)
            throw r6
    }

    /* renamed from: n */
    public static void m6199n(java.io.OutputStream r1, int r2) {
            int r0 = r2 >> 0
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1.write(r0)
            int r0 = r2 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1.write(r0)
            int r0 = r2 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1.write(r0)
            int r2 = r2 >> 24
            r2 = r2 & 255(0xff, float:3.57E-43)
            r1.write(r2)
            return
    }

    /* renamed from: o */
    public static void m6200o(java.io.OutputStream r2, long r3) {
            r0 = 0
            long r0 = r3 >>> r0
            int r1 = (int) r0
            byte r0 = (byte) r1
            r2.write(r0)
            r0 = 8
            long r0 = r3 >>> r0
            int r1 = (int) r0
            byte r0 = (byte) r1
            r2.write(r0)
            r0 = 16
            long r0 = r3 >>> r0
            int r1 = (int) r0
            byte r0 = (byte) r1
            r2.write(r0)
            r0 = 24
            long r0 = r3 >>> r0
            int r1 = (int) r0
            byte r0 = (byte) r1
            r2.write(r0)
            r0 = 32
            long r0 = r3 >>> r0
            int r1 = (int) r0
            byte r0 = (byte) r1
            r2.write(r0)
            r0 = 40
            long r0 = r3 >>> r0
            int r1 = (int) r0
            byte r0 = (byte) r1
            r2.write(r0)
            r0 = 48
            long r0 = r3 >>> r0
            int r1 = (int) r0
            byte r0 = (byte) r1
            r2.write(r0)
            r0 = 56
            long r3 = r3 >>> r0
            int r4 = (int) r3
            byte r3 = (byte) r4
            r2.write(r3)
            return
    }

    /* renamed from: p */
    public static void m6201p(java.io.OutputStream r2, java.lang.String r3) {
            java.lang.String r0 = "UTF-8"
            byte[] r3 = r3.getBytes(r0)
            int r0 = r3.length
            long r0 = (long) r0
            m6200o(r2, r0)
            int r0 = r3.length
            r1 = 0
            r2.write(r3, r1, r0)
            return
    }

    /* renamed from: a */
    public synchronized p105g2.InterfaceC2208b.a m6202a(java.lang.String r12) {
            r11 = this;
            monitor-enter(r11)
            java.util.Map<java.lang.String, h2.d$a> r0 = r11.f10923a     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r0 = r0.get(r12)     // Catch: java.lang.Throwable -> L8e
            h2.d$a r0 = (p119h2.C2442d.a) r0     // Catch: java.lang.Throwable -> L8e
            r1 = 0
            if (r0 != 0) goto Le
            monitor-exit(r11)
            return r1
        Le:
            java.io.File r2 = r11.m6203b(r12)     // Catch: java.lang.Throwable -> L8e
            r3 = 1
            r4 = 0
            r5 = 2
            h2.d$b r6 = new h2.d$b     // Catch: java.io.IOException -> L75 java.lang.Throwable -> L8e
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch: java.io.IOException -> L75 java.lang.Throwable -> L8e
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch: java.io.IOException -> L75 java.lang.Throwable -> L8e
            r8.<init>(r2)     // Catch: java.io.IOException -> L75 java.lang.Throwable -> L8e
            r7.<init>(r8)     // Catch: java.io.IOException -> L75 java.lang.Throwable -> L8e
            long r8 = r2.length()     // Catch: java.io.IOException -> L75 java.lang.Throwable -> L8e
            r6.<init>(r7, r8)     // Catch: java.io.IOException -> L75 java.lang.Throwable -> L8e
            h2.d$a r7 = p119h2.C2442d.a.m6210a(r6)     // Catch: java.lang.Throwable -> L70
            java.lang.String r8 = r7.f10928b     // Catch: java.lang.Throwable -> L70
            boolean r8 = android.text.TextUtils.equals(r12, r8)     // Catch: java.lang.Throwable -> L70
            if (r8 != 0) goto L5e
            java.lang.String r0 = "%s: key=%s, found=%s"
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L70
            java.lang.String r9 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L70
            r8[r4] = r9     // Catch: java.lang.Throwable -> L70
            r8[r3] = r12     // Catch: java.lang.Throwable -> L70
            java.lang.String r7 = r7.f10928b     // Catch: java.lang.Throwable -> L70
            r8[r5] = r7     // Catch: java.lang.Throwable -> L70
            p105g2.C2227u.m5820b(r0, r8)     // Catch: java.lang.Throwable -> L70
            java.util.Map<java.lang.String, h2.d$a> r0 = r11.f10923a     // Catch: java.lang.Throwable -> L70
            java.lang.Object r0 = r0.remove(r12)     // Catch: java.lang.Throwable -> L70
            h2.d$a r0 = (p119h2.C2442d.a) r0     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L59
            long r7 = r11.f10924b     // Catch: java.lang.Throwable -> L70
            long r9 = r0.f10927a     // Catch: java.lang.Throwable -> L70
            long r7 = r7 - r9
            r11.f10924b = r7     // Catch: java.lang.Throwable -> L70
        L59:
            r6.close()     // Catch: java.io.IOException -> L75 java.lang.Throwable -> L8e
            monitor-exit(r11)
            return r1
        L5e:
            long r7 = r6.f10935Y     // Catch: java.lang.Throwable -> L70
            long r9 = r6.f10936Z     // Catch: java.lang.Throwable -> L70
            long r7 = r7 - r9
            byte[] r7 = m6198m(r6, r7)     // Catch: java.lang.Throwable -> L70
            g2.b$a r0 = r0.m6211b(r7)     // Catch: java.lang.Throwable -> L70
            r6.close()     // Catch: java.io.IOException -> L75 java.lang.Throwable -> L8e
            monitor-exit(r11)
            return r0
        L70:
            r0 = move-exception
            r6.close()     // Catch: java.io.IOException -> L75 java.lang.Throwable -> L8e
            throw r0     // Catch: java.io.IOException -> L75 java.lang.Throwable -> L8e
        L75:
            r0 = move-exception
            java.lang.String r6 = "%s: %s"
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L8e
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L8e
            r5[r4] = r2     // Catch: java.lang.Throwable -> L8e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L8e
            r5[r3] = r0     // Catch: java.lang.Throwable -> L8e
            p105g2.C2227u.m5820b(r6, r5)     // Catch: java.lang.Throwable -> L8e
            r11.m6209l(r12)     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r11)
            return r1
        L8e:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
    }

    /* renamed from: b */
    public java.io.File m6203b(java.lang.String r3) {
            r2 = this;
            java.io.File r0 = new java.io.File
            h2.d$c r1 = r2.f10925c
            h2.k r1 = (p119h2.C2449k) r1
            java.io.File r1 = r1.m6225a()
            java.lang.String r3 = r2.m6204c(r3)
            r0.<init>(r1, r3)
            return r0
    }

    /* renamed from: c */
    public final java.lang.String m6204c(java.lang.String r3) {
            r2 = this;
            int r0 = r3.length()
            int r0 = r0 / 2
            r1 = 0
            java.lang.String r1 = r3.substring(r1, r0)
            int r1 = r1.hashCode()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String r3 = r3.substring(r0)
            int r3 = r3.hashCode()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            return r3
    }

    /* renamed from: d */
    public synchronized void m6205d() {
            r9 = this;
            monitor-enter(r9)
            h2.d$c r0 = r9.f10925c     // Catch: java.lang.Throwable -> L62
            h2.k r0 = (p119h2.C2449k) r0     // Catch: java.lang.Throwable -> L62
            java.io.File r0 = r0.m6225a()     // Catch: java.lang.Throwable -> L62
            boolean r1 = r0.exists()     // Catch: java.lang.Throwable -> L62
            r2 = 0
            if (r1 != 0) goto L26
            boolean r1 = r0.mkdirs()     // Catch: java.lang.Throwable -> L62
            if (r1 != 0) goto L24
            java.lang.String r1 = "Unable to create cache dir %s"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L62
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L62
            r3[r2] = r0     // Catch: java.lang.Throwable -> L62
            p105g2.C2227u.m5821c(r1, r3)     // Catch: java.lang.Throwable -> L62
        L24:
            monitor-exit(r9)
            return
        L26:
            java.io.File[] r0 = r0.listFiles()     // Catch: java.lang.Throwable -> L62
            if (r0 != 0) goto L2e
            monitor-exit(r9)
            return
        L2e:
            int r1 = r0.length     // Catch: java.lang.Throwable -> L62
        L2f:
            if (r2 >= r1) goto L60
            r3 = r0[r2]     // Catch: java.lang.Throwable -> L62
            long r4 = r3.length()     // Catch: java.io.IOException -> L5a java.lang.Throwable -> L62
            h2.d$b r6 = new h2.d$b     // Catch: java.io.IOException -> L5a java.lang.Throwable -> L62
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch: java.io.IOException -> L5a java.lang.Throwable -> L62
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch: java.io.IOException -> L5a java.lang.Throwable -> L62
            r8.<init>(r3)     // Catch: java.io.IOException -> L5a java.lang.Throwable -> L62
            r7.<init>(r8)     // Catch: java.io.IOException -> L5a java.lang.Throwable -> L62
            r6.<init>(r7, r4)     // Catch: java.io.IOException -> L5a java.lang.Throwable -> L62
            h2.d$a r7 = p119h2.C2442d.a.m6210a(r6)     // Catch: java.lang.Throwable -> L55
            r7.f10927a = r4     // Catch: java.lang.Throwable -> L55
            java.lang.String r4 = r7.f10928b     // Catch: java.lang.Throwable -> L55
            r9.m6208g(r4, r7)     // Catch: java.lang.Throwable -> L55
            r6.close()     // Catch: java.io.IOException -> L5a java.lang.Throwable -> L62
            goto L5d
        L55:
            r4 = move-exception
            r6.close()     // Catch: java.io.IOException -> L5a java.lang.Throwable -> L62
            throw r4     // Catch: java.io.IOException -> L5a java.lang.Throwable -> L62
        L5a:
            r3.delete()     // Catch: java.lang.Throwable -> L62
        L5d:
            int r2 = r2 + 1
            goto L2f
        L60:
            monitor-exit(r9)
            return
        L62:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
    }

    /* renamed from: e */
    public final void m6206e() {
            r14 = this;
            long r0 = r14.f10924b
            int r2 = r14.f10926d
            long r2 = (long) r2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto La
            return
        La:
            boolean r0 = p105g2.C2227u.f10176a
            r1 = 0
            if (r0 == 0) goto L16
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r2 = "Pruning old cache entries."
            p105g2.C2227u.m5822d(r2, r0)
        L16:
            long r2 = r14.f10924b
            long r4 = android.os.SystemClock.elapsedRealtime()
            java.util.Map<java.lang.String, h2.d$a> r0 = r14.f10923a
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r6 = 0
        L27:
            boolean r7 = r0.hasNext()
            r8 = 2
            r9 = 1
            if (r7 == 0) goto L74
            java.lang.Object r7 = r0.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r7 = r7.getValue()
            h2.d$a r7 = (p119h2.C2442d.a) r7
            java.lang.String r10 = r7.f10928b
            java.io.File r10 = r14.m6203b(r10)
            boolean r10 = r10.delete()
            if (r10 == 0) goto L4f
            long r10 = r14.f10924b
            long r12 = r7.f10927a
            long r10 = r10 - r12
            r14.f10924b = r10
            goto L60
        L4f:
            java.lang.Object[] r10 = new java.lang.Object[r8]
            java.lang.String r7 = r7.f10928b
            r10[r1] = r7
            java.lang.String r7 = r14.m6204c(r7)
            r10[r9] = r7
            java.lang.String r7 = "Could not delete cache entry for key=%s, filename=%s"
            p105g2.C2227u.m5820b(r7, r10)
        L60:
            r0.remove()
            int r6 = r6 + 1
            long r10 = r14.f10924b
            float r7 = (float) r10
            int r10 = r14.f10926d
            float r10 = (float) r10
            r11 = 1063675494(0x3f666666, float:0.9)
            float r10 = r10 * r11
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 >= 0) goto L27
        L74:
            boolean r0 = p105g2.C2227u.f10176a
            if (r0 == 0) goto L9a
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0[r1] = r6
            long r6 = r14.f10924b
            long r6 = r6 - r2
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            r0[r9] = r1
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r1 = r1 - r4
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0[r8] = r1
            java.lang.String r1 = "pruned %d files, %d bytes, %d ms"
            p105g2.C2227u.m5822d(r1, r0)
        L9a:
            return
    }

    /* renamed from: f */
    public synchronized void m6207f(java.lang.String r8, p105g2.InterfaceC2208b.a r9) {
            r7 = this;
            monitor-enter(r7)
            long r0 = r7.f10924b     // Catch: java.lang.Throwable -> L99
            byte[] r2 = r9.f10104a     // Catch: java.lang.Throwable -> L99
            int r3 = r2.length     // Catch: java.lang.Throwable -> L99
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L99
            long r0 = r0 + r3
            int r3 = r7.f10926d     // Catch: java.lang.Throwable -> L99
            long r4 = (long) r3     // Catch: java.lang.Throwable -> L99
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 <= 0) goto L1d
            int r0 = r2.length     // Catch: java.lang.Throwable -> L99
            float r0 = (float) r0
            float r1 = (float) r3
            r2 = 1063675494(0x3f666666, float:0.9)
            float r1 = r1 * r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L1d
            monitor-exit(r7)
            return
        L1d:
            java.io.File r0 = r7.m6203b(r8)     // Catch: java.lang.Throwable -> L99
            r1 = 1
            r2 = 0
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L99
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L99
            r4.<init>(r0)     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L99
            r3.<init>(r4)     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L99
            h2.d$a r4 = new h2.d$a     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L99
            r4.<init>(r8, r9)     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L99
            boolean r5 = r4.m6212c(r3)     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L99
            if (r5 == 0) goto L4d
            byte[] r9 = r9.f10104a     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L99
            r3.write(r9)     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L99
            r3.close()     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L99
            long r5 = r0.length()     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L99
            r4.f10927a = r5     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L99
            r7.m6208g(r8, r4)     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L99
            r7.m6206e()     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L99
            goto L97
        L4d:
            r3.close()     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L99
            java.lang.String r8 = "Failed to write header for %s"
            java.lang.Object[] r9 = new java.lang.Object[r1]     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L99
            java.lang.String r3 = r0.getAbsolutePath()     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L99
            r9[r2] = r3     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L99
            p105g2.C2227u.m5820b(r8, r9)     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L99
            java.io.IOException r8 = new java.io.IOException     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L99
            r8.<init>()     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L99
            throw r8     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L99
        L63:
            boolean r8 = r0.delete()     // Catch: java.lang.Throwable -> L99
            if (r8 != 0) goto L76
            java.lang.String r8 = "Could not clean up file %s"
            java.lang.Object[] r9 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L99
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L99
            r9[r2] = r0     // Catch: java.lang.Throwable -> L99
            p105g2.C2227u.m5820b(r8, r9)     // Catch: java.lang.Throwable -> L99
        L76:
            h2.d$c r8 = r7.f10925c     // Catch: java.lang.Throwable -> L99
            h2.k r8 = (p119h2.C2449k) r8     // Catch: java.lang.Throwable -> L99
            java.io.File r8 = r8.m6225a()     // Catch: java.lang.Throwable -> L99
            boolean r8 = r8.exists()     // Catch: java.lang.Throwable -> L99
            if (r8 != 0) goto L97
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L99
            java.lang.String r9 = "Re-initializing cache after external clearing."
            p105g2.C2227u.m5820b(r9, r8)     // Catch: java.lang.Throwable -> L99
            java.util.Map<java.lang.String, h2.d$a> r8 = r7.f10923a     // Catch: java.lang.Throwable -> L99
            r8.clear()     // Catch: java.lang.Throwable -> L99
            r8 = 0
            r7.f10924b = r8     // Catch: java.lang.Throwable -> L99
            r7.m6205d()     // Catch: java.lang.Throwable -> L99
        L97:
            monitor-exit(r7)
            return
        L99:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
    }

    /* renamed from: g */
    public final void m6208g(java.lang.String r8, p119h2.C2442d.a r9) {
            r7 = this;
            java.util.Map<java.lang.String, h2.d$a> r0 = r7.f10923a
            boolean r0 = r0.containsKey(r8)
            if (r0 != 0) goto L10
            long r0 = r7.f10924b
            long r2 = r9.f10927a
            long r0 = r0 + r2
            r7.f10924b = r0
            goto L22
        L10:
            java.util.Map<java.lang.String, h2.d$a> r0 = r7.f10923a
            java.lang.Object r0 = r0.get(r8)
            h2.d$a r0 = (p119h2.C2442d.a) r0
            long r1 = r7.f10924b
            long r3 = r9.f10927a
            long r5 = r0.f10927a
            long r3 = r3 - r5
            long r3 = r3 + r1
            r7.f10924b = r3
        L22:
            java.util.Map<java.lang.String, h2.d$a> r0 = r7.f10923a
            r0.put(r8, r9)
            return
    }

    /* renamed from: l */
    public synchronized void m6209l(java.lang.String r7) {
            r6 = this;
            monitor-enter(r6)
            java.io.File r0 = r6.m6203b(r7)     // Catch: java.lang.Throwable -> L30
            boolean r0 = r0.delete()     // Catch: java.lang.Throwable -> L30
            java.util.Map<java.lang.String, h2.d$a> r1 = r6.f10923a     // Catch: java.lang.Throwable -> L30
            java.lang.Object r1 = r1.remove(r7)     // Catch: java.lang.Throwable -> L30
            h2.d$a r1 = (p119h2.C2442d.a) r1     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L1a
            long r2 = r6.f10924b     // Catch: java.lang.Throwable -> L30
            long r4 = r1.f10927a     // Catch: java.lang.Throwable -> L30
            long r2 = r2 - r4
            r6.f10924b = r2     // Catch: java.lang.Throwable -> L30
        L1a:
            if (r0 != 0) goto L2e
            java.lang.String r0 = "Could not delete cache entry for key=%s, filename=%s"
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L30
            r2 = 0
            r1[r2] = r7     // Catch: java.lang.Throwable -> L30
            r2 = 1
            java.lang.String r7 = r6.m6204c(r7)     // Catch: java.lang.Throwable -> L30
            r1[r2] = r7     // Catch: java.lang.Throwable -> L30
            p105g2.C2227u.m5820b(r0, r1)     // Catch: java.lang.Throwable -> L30
        L2e:
            monitor-exit(r6)
            return
        L30:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }
}
