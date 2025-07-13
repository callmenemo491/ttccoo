package p317ri;

/* renamed from: ri.i */
/* loaded from: classes.dex */
public class C5882i extends p317ri.AbstractC5912s {

    /* renamed from: Y */
    public byte[] f22703Y;

    public C5882i(byte[] r1) {
            r0 = this;
            r0.<init>()
            r0.f22703Y = r1
            return
    }

    /* renamed from: F */
    public static p317ri.C5882i m12224F(java.lang.Object r2) {
            if (r2 == 0) goto L40
            boolean r0 = r2 instanceof p317ri.C5882i
            if (r0 == 0) goto L7
            goto L40
        L7:
            boolean r0 = r2 instanceof byte[]
            if (r0 == 0) goto L25
            byte[] r2 = (byte[]) r2     // Catch: java.lang.Exception -> L14
            ri.s r2 = p317ri.AbstractC5912s.m12271u(r2)     // Catch: java.lang.Exception -> L14
            ri.i r2 = (p317ri.C5882i) r2     // Catch: java.lang.Exception -> L14
            return r2
        L14:
            r2 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "encoding error in getInstance: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String r2 = androidx.fragment.app.C0390k0.m1221a(r2, r1)
            r0.<init>(r2)
            throw r0
        L25:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "illegal object in getInstance: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
        L40:
            ri.i r2 = (p317ri.C5882i) r2
            return r2
    }

    /* renamed from: C */
    public final java.lang.String m12225C() {
            r6 = this;
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()
            int r1 = r0.getRawOffset()
            java.lang.String r2 = "+"
            if (r1 >= 0) goto L10
            int r1 = -r1
            java.lang.String r3 = "-"
            goto L11
        L10:
            r3 = r2
        L11:
            r4 = 3600000(0x36ee80, float:5.044674E-39)
            int r4 = r1 / r4
            int r5 = r4 * 60
            int r5 = r5 * 60
            int r5 = r5 * 1000
            int r1 = r1 - r5
            r5 = 60000(0xea60, float:8.4078E-41)
            int r1 = r1 / r5
            boolean r5 = r0.useDaylightTime()     // Catch: java.text.ParseException -> L3b
            if (r5 == 0) goto L3b
            java.util.Date r5 = r6.m12227E()     // Catch: java.text.ParseException -> L3b
            boolean r0 = r0.inDaylightTime(r5)     // Catch: java.text.ParseException -> L3b
            if (r0 == 0) goto L3b
            boolean r0 = r3.equals(r2)     // Catch: java.text.ParseException -> L3b
            if (r0 == 0) goto L39
            r0 = 1
            goto L3a
        L39:
            r0 = -1
        L3a:
            int r4 = r4 + r0
        L3b:
            java.lang.String r0 = "GMT"
            java.lang.StringBuilder r0 = android.support.v4.media.C0143b.m255a(r0, r3)
            java.lang.String r2 = r6.m12226D(r4)
            r0.append(r2)
            java.lang.String r2 = ":"
            r0.append(r2)
            java.lang.String r1 = r6.m12226D(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* renamed from: D */
    public final java.lang.String m12226D(int r2) {
            r1 = this;
            r0 = 10
            if (r2 >= r0) goto Lb
            java.lang.String r0 = "0"
            java.lang.String r2 = android.support.v4.media.C0142a.m254a(r0, r2)
            return r2
        Lb:
            java.lang.String r2 = java.lang.Integer.toString(r2)
            return r2
    }

    /* renamed from: E */
    public java.util.Date m12227E() {
            r9 = this;
            byte[] r0 = r9.f22703Y
            java.lang.String r0 = p400wj.C6892e.m13958a(r0)
            java.lang.String r1 = "Z"
            boolean r1 = r0.endsWith(r1)
            r2 = 0
            if (r1 == 0) goto L49
            boolean r1 = r9.m12229I()
            if (r1 == 0) goto L1d
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.lang.String r3 = "yyyyMMddHHmmss.SSS'Z'"
            r1.<init>(r3)
            goto L40
        L1d:
            boolean r1 = r9.m12231L()
            if (r1 == 0) goto L2b
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.lang.String r3 = "yyyyMMddHHmmss'Z'"
            r1.<init>(r3)
            goto L40
        L2b:
            boolean r1 = r9.m12230K()
            if (r1 == 0) goto L39
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.lang.String r3 = "yyyyMMddHHmm'Z'"
            r1.<init>(r3)
            goto L40
        L39:
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.lang.String r3 = "yyyyMMddHH'Z'"
            r1.<init>(r3)
        L40:
            java.util.SimpleTimeZone r3 = new java.util.SimpleTimeZone
            java.lang.String r4 = "Z"
            r3.<init>(r2, r4)
            goto Ld5
        L49:
            r1 = 45
            int r1 = r0.indexOf(r1)
            if (r1 > 0) goto L99
            r1 = 43
            int r1 = r0.indexOf(r1)
            if (r1 <= 0) goto L5a
            goto L99
        L5a:
            boolean r1 = r9.m12229I()
            if (r1 == 0) goto L68
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.lang.String r3 = "yyyyMMddHHmmss.SSS"
            r1.<init>(r3)
            goto L8b
        L68:
            boolean r1 = r9.m12231L()
            if (r1 == 0) goto L76
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.lang.String r3 = "yyyyMMddHHmmss"
            r1.<init>(r3)
            goto L8b
        L76:
            boolean r1 = r9.m12230K()
            if (r1 == 0) goto L84
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.lang.String r3 = "yyyyMMddHHmm"
            r1.<init>(r3)
            goto L8b
        L84:
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.lang.String r3 = "yyyyMMddHH"
            r1.<init>(r3)
        L8b:
            java.util.SimpleTimeZone r3 = new java.util.SimpleTimeZone
            java.util.TimeZone r4 = java.util.TimeZone.getDefault()
            java.lang.String r4 = r4.getID()
            r3.<init>(r2, r4)
            goto Ld5
        L99:
            java.lang.String r0 = r9.m12228H()
            boolean r1 = r9.m12229I()
            if (r1 == 0) goto Lab
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.lang.String r3 = "yyyyMMddHHmmss.SSSz"
            r1.<init>(r3)
            goto Lce
        Lab:
            boolean r1 = r9.m12231L()
            if (r1 == 0) goto Lb9
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.lang.String r3 = "yyyyMMddHHmmssz"
            r1.<init>(r3)
            goto Lce
        Lb9:
            boolean r1 = r9.m12230K()
            if (r1 == 0) goto Lc7
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.lang.String r3 = "yyyyMMddHHmmz"
            r1.<init>(r3)
            goto Lce
        Lc7:
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.lang.String r3 = "yyyyMMddHHz"
            r1.<init>(r3)
        Lce:
            java.util.SimpleTimeZone r3 = new java.util.SimpleTimeZone
            java.lang.String r4 = "Z"
            r3.<init>(r2, r4)
        Ld5:
            r1.setTimeZone(r3)
            boolean r3 = r9.m12229I()
            if (r3 == 0) goto L167
            r3 = 14
            java.lang.String r4 = r0.substring(r3)
            r5 = 1
            r6 = 1
        Le6:
            int r7 = r4.length()
            if (r6 >= r7) goto Lfc
            char r7 = r4.charAt(r6)
            r8 = 48
            if (r8 > r7) goto Lfc
            r8 = 57
            if (r7 <= r8) goto Lf9
            goto Lfc
        Lf9:
            int r6 = r6 + 1
            goto Le6
        Lfc:
            int r7 = r6 + (-1)
            r8 = 3
            if (r7 <= r8) goto L11f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r7 = 4
            java.lang.String r7 = r4.substring(r2, r7)
            r5.append(r7)
            java.lang.String r4 = r4.substring(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            goto L159
        L11f:
            if (r7 != r5) goto L13c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "00"
            one.block.eosiojava.utilities.C5331a.m11639a(r4, r2, r6, r5, r7)
            java.lang.String r4 = r4.substring(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            goto L159
        L13c:
            r5 = 2
            if (r7 != r5) goto L167
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "0"
            one.block.eosiojava.utilities.C5331a.m11639a(r4, r2, r6, r5, r7)
            java.lang.String r4 = r4.substring(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
        L159:
            java.lang.String r0 = r0.substring(r2, r3)
            r5.append(r0)
            r5.append(r4)
            java.lang.String r0 = r5.toString()
        L167:
            java.util.Date r0 = r1.parse(r0)
            java.lang.Long r1 = p317ri.C5902o1.f22724a
            java.util.Locale r1 = java.util.Locale.getDefault()
            if (r1 != 0) goto L174
            goto L1bc
        L174:
            java.util.Map r2 = p317ri.C5902o1.f22725b
            monitor-enter(r2)
            r3 = r2
            java.util.HashMap r3 = (java.util.HashMap) r3     // Catch: java.lang.Throwable -> L1bd
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L1bd
            java.lang.Long r3 = (java.lang.Long) r3     // Catch: java.lang.Throwable -> L1bd
            if (r3 != 0) goto L1a6
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L1bd
            java.lang.String r4 = "yyyyMMddHHmmssz"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L1bd
            java.lang.String r4 = "19700101000000GMT+00:00"
            java.util.Date r3 = r3.parse(r4)     // Catch: java.lang.Throwable -> L1bd
            long r3 = r3.getTime()     // Catch: java.lang.Throwable -> L1bd
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L19c
            java.lang.Long r3 = p317ri.C5902o1.f22724a     // Catch: java.lang.Throwable -> L1bd
            goto L1a0
        L19c:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L1bd
        L1a0:
            r4 = r2
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch: java.lang.Throwable -> L1bd
            r4.put(r1, r3)     // Catch: java.lang.Throwable -> L1bd
        L1a6:
            java.lang.Long r1 = p317ri.C5902o1.f22724a     // Catch: java.lang.Throwable -> L1bd
            if (r3 == r1) goto L1bb
            java.util.Date r1 = new java.util.Date     // Catch: java.lang.Throwable -> L1bd
            long r4 = r0.getTime()     // Catch: java.lang.Throwable -> L1bd
            long r6 = r3.longValue()     // Catch: java.lang.Throwable -> L1bd
            long r4 = r4 - r6
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L1bd
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1bd
            r0 = r1
            goto L1bc
        L1bb:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1bd
        L1bc:
            return r0
        L1bd:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1bd
            throw r0
    }

    /* renamed from: H */
    public java.lang.String m12228H() {
            r7 = this;
            byte[] r0 = r7.f22703Y
            java.lang.String r0 = p400wj.C6892e.m13958a(r0)
            int r1 = r0.length()
            int r1 = r1 + (-1)
            char r1 = r0.charAt(r1)
            r2 = 0
            r3 = 90
            if (r1 != r3) goto L31
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r3 = r0.length()
            int r3 = r3 + (-1)
            java.lang.String r0 = r0.substring(r2, r3)
            r1.append(r0)
            java.lang.String r0 = "GMT+00:00"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L31:
            int r1 = r0.length()
            int r1 = r1 + (-5)
            char r3 = r0.charAt(r1)
            java.lang.String r4 = "GMT"
            r5 = 45
            if (r3 == r5) goto L7e
            r6 = 43
            if (r3 != r6) goto L46
            goto L7e
        L46:
            int r1 = r0.length()
            int r1 = r1 + (-3)
            char r3 = r0.charAt(r1)
            if (r3 == r5) goto L65
            if (r3 != r6) goto L55
            goto L65
        L55:
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r7.m12225C()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L65:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            one.block.eosiojava.utilities.C5331a.m11639a(r0, r2, r1, r3, r4)
            java.lang.String r0 = r0.substring(r1)
            r3.append(r0)
            java.lang.String r0 = ":00"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            return r0
        L7e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = r0.substring(r2, r1)
            r3.append(r2)
            r3.append(r4)
            int r2 = r1 + 3
            java.lang.String r4 = ":"
            one.block.eosiojava.utilities.C5331a.m11639a(r0, r1, r2, r3, r4)
            java.lang.String r0 = r0.substring(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            return r0
    }

    /* renamed from: I */
    public boolean m12229I() {
            r4 = this;
            r0 = 0
            r1 = 0
        L2:
            byte[] r2 = r4.f22703Y
            int r3 = r2.length
            if (r1 == r3) goto L16
            r2 = r2[r1]
            r3 = 46
            if (r2 != r3) goto L13
            r2 = 14
            if (r1 != r2) goto L13
            r0 = 1
            return r0
        L13:
            int r1 = r1 + 1
            goto L2
        L16:
            return r0
    }

    /* renamed from: K */
    public boolean m12230K() {
            r1 = this;
            r0 = 10
            boolean r0 = r1.m12232O(r0)
            if (r0 == 0) goto L12
            r0 = 11
            boolean r0 = r1.m12232O(r0)
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    /* renamed from: L */
    public boolean m12231L() {
            r1 = this;
            r0 = 12
            boolean r0 = r1.m12232O(r0)
            if (r0 == 0) goto L12
            r0 = 13
            boolean r0 = r1.m12232O(r0)
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    /* renamed from: O */
    public final boolean m12232O(int r4) {
            r3 = this;
            byte[] r0 = r3.f22703Y
            int r1 = r0.length
            if (r1 <= r4) goto L13
            r1 = r0[r4]
            r2 = 48
            if (r1 < r2) goto L13
            r4 = r0[r4]
            r0 = 57
            if (r4 > r0) goto L13
            r4 = 1
            goto L14
        L13:
            r4 = 0
        L14:
            return r4
    }

    @Override // p317ri.AbstractC5894m
    public int hashCode() {
            r1 = this;
            byte[] r0 = r1.f22703Y
            int r0 = p400wj.C6888a.m13952d(r0)
            return r0
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: n */
    public boolean mo12203n(p317ri.AbstractC5912s r2) {
            r1 = this;
            boolean r0 = r2 instanceof p317ri.C5882i
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            byte[] r0 = r1.f22703Y
            ri.i r2 = (p317ri.C5882i) r2
            byte[] r2 = r2.f22703Y
            boolean r2 = p400wj.C6888a.m13949a(r0, r2)
            return r2
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: p */
    public void mo12204p(p317ri.C5906q r3) {
            r2 = this;
            byte[] r0 = r2.f22703Y
            r1 = 24
            r3.m12266e(r1, r0)
            return
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: q */
    public int mo12205q() {
            r2 = this;
            byte[] r0 = r2.f22703Y
            int r0 = r0.length
            int r1 = p317ri.C5923v1.m12290a(r0)
            int r1 = r1 + 1
            int r1 = r1 + r0
            return r1
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: w */
    public boolean mo12206w() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: z */
    public p317ri.AbstractC5912s mo12212z() {
            r2 = this;
            ri.s0 r0 = new ri.s0
            byte[] r1 = r2.f22703Y
            r0.<init>(r1)
            return r0
    }
}
