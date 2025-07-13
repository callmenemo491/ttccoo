package p065e0;

/* renamed from: e0.f */
/* loaded from: classes.dex */
public class C1501f {

    /* renamed from: e0.f$a */
    public interface a {
    }

    /* renamed from: e0.f$b */
    public static final class b implements p065e0.C1501f.a {

        /* renamed from: a */
        public final p065e0.C1501f.c[] f7301a;

        public b(p065e0.C1501f.c[] r1) {
                r0 = this;
                r0.<init>()
                r0.f7301a = r1
                return
        }
    }

    /* renamed from: e0.f$c */
    public static final class c {

        /* renamed from: a */
        public final java.lang.String f7302a;

        /* renamed from: b */
        public int f7303b;

        /* renamed from: c */
        public boolean f7304c;

        /* renamed from: d */
        public java.lang.String f7305d;

        /* renamed from: e */
        public int f7306e;

        /* renamed from: f */
        public int f7307f;

        public c(java.lang.String r1, int r2, boolean r3, java.lang.String r4, int r5, int r6) {
                r0 = this;
                r0.<init>()
                r0.f7302a = r1
                r0.f7303b = r2
                r0.f7304c = r3
                r0.f7305d = r4
                r0.f7306e = r5
                r0.f7307f = r6
                return
        }
    }

    /* renamed from: e0.f$d */
    public static final class d implements p065e0.C1501f.a {

        /* renamed from: a */
        public final p178k0.C3629e f7308a;

        /* renamed from: b */
        public final int f7309b;

        /* renamed from: c */
        public final int f7310c;

        /* renamed from: d */
        public final java.lang.String f7311d;

        public d(p178k0.C3629e r1, int r2, int r3, java.lang.String r4) {
                r0 = this;
                r0.<init>()
                r0.f7308a = r1
                r0.f7310c = r2
                r0.f7309b = r3
                r0.f7311d = r4
                return
        }
    }

    /* renamed from: a */
    public static p065e0.C1501f.a m4078a(org.xmlpull.v1.XmlPullParser r23, android.content.res.Resources r24) {
            r0 = r24
        L2:
            int r1 = r23.next()
            r2 = 2
            r3 = 1
            if (r1 == r2) goto Ld
            if (r1 == r3) goto Ld
            goto L2
        Ld:
            if (r1 != r2) goto L125
            java.lang.String r1 = "font-family"
            r4 = 0
            r5 = r23
            r5.require(r2, r4, r1)
            java.lang.String r6 = r23.getName()
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L120
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r23)
            int[] r6 = p017b0.C0653a.f3795b
            android.content.res.TypedArray r1 = r0.obtainAttributes(r1, r6)
            r6 = 0
            java.lang.String r7 = r1.getString(r6)
            r8 = 4
            java.lang.String r9 = r1.getString(r8)
            r10 = 5
            java.lang.String r11 = r1.getString(r10)
            int r12 = r1.getResourceId(r3, r6)
            int r13 = r1.getInteger(r2, r3)
            r14 = 500(0x1f4, float:7.0E-43)
            r15 = 3
            int r14 = r1.getInteger(r15, r14)
            r4 = 6
            java.lang.String r8 = r1.getString(r4)
            r1.recycle()
            if (r7 == 0) goto L71
            if (r9 == 0) goto L71
            if (r11 == 0) goto L71
        L57:
            int r1 = r23.next()
            if (r1 == r15) goto L61
            m4080c(r23)
            goto L57
        L61:
            java.util.List r0 = m4079b(r0, r12)
            e0.f$d r4 = new e0.f$d
            k0.e r1 = new k0.e
            r1.<init>(r7, r9, r11, r0)
            r4.<init>(r1, r13, r14, r8)
            goto L124
        L71:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L76:
            int r7 = r23.next()
            if (r7 == r15) goto L107
            int r7 = r23.getEventType()
            if (r7 == r2) goto L83
            goto L76
        L83:
            java.lang.String r7 = r23.getName()
            java.lang.String r8 = "font"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L102
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r23)
            int[] r8 = p017b0.C0653a.f3796c
            android.content.res.TypedArray r7 = r0.obtainAttributes(r7, r8)
            r8 = 8
            boolean r9 = r7.hasValue(r8)
            if (r9 == 0) goto La2
            goto La3
        La2:
            r8 = 1
        La3:
            r9 = 400(0x190, float:5.6E-43)
            int r18 = r7.getInt(r8, r9)
            boolean r8 = r7.hasValue(r4)
            if (r8 == 0) goto Lb1
            r8 = 6
            goto Lb2
        Lb1:
            r8 = 2
        Lb2:
            int r8 = r7.getInt(r8, r6)
            if (r3 != r8) goto Lbb
            r19 = 1
            goto Lbd
        Lbb:
            r19 = 0
        Lbd:
            r8 = 9
            boolean r9 = r7.hasValue(r8)
            if (r9 == 0) goto Lc6
            goto Lc7
        Lc6:
            r8 = 3
        Lc7:
            r9 = 7
            boolean r11 = r7.hasValue(r9)
            if (r11 == 0) goto Lcf
            goto Ld0
        Lcf:
            r9 = 4
        Ld0:
            java.lang.String r20 = r7.getString(r9)
            int r21 = r7.getInt(r8, r6)
            boolean r8 = r7.hasValue(r10)
            if (r8 == 0) goto Le0
            r8 = 5
            goto Le1
        Le0:
            r8 = 0
        Le1:
            int r22 = r7.getResourceId(r8, r6)
            java.lang.String r17 = r7.getString(r8)
            r7.recycle()
        Lec:
            int r7 = r23.next()
            if (r7 == r15) goto Lf6
            m4080c(r23)
            goto Lec
        Lf6:
            e0.f$c r7 = new e0.f$c
            r16 = r7
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r1.add(r7)
            goto L76
        L102:
            m4080c(r23)
            goto L76
        L107:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L10e
            goto L123
        L10e:
            e0.f$b r4 = new e0.f$b
            int r0 = r1.size()
            e0.f$c[] r0 = new p065e0.C1501f.c[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            e0.f$c[] r0 = (p065e0.C1501f.c[]) r0
            r4.<init>(r0)
            goto L124
        L120:
            m4080c(r23)
        L123:
            r4 = 0
        L124:
            return r4
        L125:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "No start tag found"
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: b */
    public static java.util.List<java.util.List<byte[]>> m4079b(android.content.res.Resources r5, int r6) {
            if (r6 != 0) goto L7
            java.util.List r5 = java.util.Collections.emptyList()
            return r5
        L7:
            android.content.res.TypedArray r0 = r5.obtainTypedArray(r6)
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L50
            if (r1 != 0) goto L19
            java.util.List r5 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L50
            r0.recycle()
            return r5
        L19:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L50
            r1.<init>()     // Catch: java.lang.Throwable -> L50
            r2 = 0
            int r3 = r0.getType(r2)     // Catch: java.lang.Throwable -> L50
            r4 = 1
            if (r3 != r4) goto L41
            r6 = 0
        L27:
            int r3 = r0.length()     // Catch: java.lang.Throwable -> L50
            if (r6 >= r3) goto L4c
            int r3 = r0.getResourceId(r6, r2)     // Catch: java.lang.Throwable -> L50
            if (r3 == 0) goto L3e
            java.lang.String[] r3 = r5.getStringArray(r3)     // Catch: java.lang.Throwable -> L50
            java.util.List r3 = m4081d(r3)     // Catch: java.lang.Throwable -> L50
            r1.add(r3)     // Catch: java.lang.Throwable -> L50
        L3e:
            int r6 = r6 + 1
            goto L27
        L41:
            java.lang.String[] r5 = r5.getStringArray(r6)     // Catch: java.lang.Throwable -> L50
            java.util.List r5 = m4081d(r5)     // Catch: java.lang.Throwable -> L50
            r1.add(r5)     // Catch: java.lang.Throwable -> L50
        L4c:
            r0.recycle()
            return r1
        L50:
            r5 = move-exception
            r0.recycle()
            throw r5
    }

    /* renamed from: c */
    public static void m4080c(org.xmlpull.v1.XmlPullParser r3) {
            r0 = 1
        L1:
            if (r0 <= 0) goto L14
            int r1 = r3.next()
            r2 = 2
            if (r1 == r2) goto L11
            r2 = 3
            if (r1 == r2) goto Le
            goto L1
        Le:
            int r0 = r0 + (-1)
            goto L1
        L11:
            int r0 = r0 + 1
            goto L1
        L14:
            return
    }

    /* renamed from: d */
    public static java.util.List<byte[]> m4081d(java.lang.String[] r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r5.length
            r2 = 0
            r3 = 0
        L8:
            if (r3 >= r1) goto L16
            r4 = r5[r3]
            byte[] r4 = android.util.Base64.decode(r4, r2)
            r0.add(r4)
            int r3 = r3 + 1
            goto L8
        L16:
            return r0
    }
}
