package p362uh;

/* renamed from: uh.e */
/* loaded from: classes.dex */
public class C6459e extends p101fh.C2174f {

    /* renamed from: uh.e$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<java.lang.String, java.lang.String> {

        /* renamed from: Z */
        public static final p362uh.C6459e.a f25049Z = null;

        static {
                uh.e$a r0 = new uh.e$a
                r0.<init>()
                p362uh.C6459e.a.f25049Z = r0
                return
        }

        public a() {
                r1 = this;
                r0 = 1
                r1.<init>(r0)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public java.lang.String mo107b(java.lang.String r2) {
                r1 = this;
                java.lang.String r2 = (java.lang.String) r2
                java.lang.String r0 = "line"
                p214m2.C4339q.m9706k(r2, r0)
                return r2
        }
    }

    /* renamed from: uh.e$b */
    public static final class b extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<java.lang.String, java.lang.String> {

        /* renamed from: Z */
        public final /* synthetic */ java.lang.String f25050Z;

        public b(java.lang.String r1) {
                r0 = this;
                r0.f25050Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public java.lang.String mo107b(java.lang.String r3) {
                r2 = this;
                java.lang.String r3 = (java.lang.String) r3
                java.lang.String r0 = "line"
                p214m2.C4339q.m9706k(r3, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r2.f25050Z
                java.lang.String r3 = p346u.C6269n.m12888a(r0, r1, r3)
                return r3
        }
    }

    /* renamed from: B */
    public static final mh.InterfaceC4620l<java.lang.String, java.lang.String> m13045B(java.lang.String r1) {
            int r0 = r1.length()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto Le
            uh.e$a r1 = p362uh.C6459e.a.f25049Z
            goto L14
        Le:
            uh.e$b r0 = new uh.e$b
            r0.<init>(r1)
            r1 = r0
        L14:
            return r1
    }

    /* renamed from: C */
    public static final java.lang.String m13046C(java.lang.String r15) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r15, r0)
            p214m2.C4339q.m9706k(r15, r0)
            java.lang.String r1 = ""
            java.lang.String r2 = "newIndent"
            p214m2.C4339q.m9706k(r1, r2)
            java.util.List r2 = p362uh.C6467m.m13073d0(r15)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r4 = r2.iterator()
        L1c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L35
            java.lang.Object r5 = r4.next()
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = p362uh.C6463i.m13054K(r6)
            r6 = r6 ^ 1
            if (r6 == 0) goto L1c
            r3.add(r5)
            goto L1c
        L35:
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = p062dh.C1469e.m3992D(r3, r5)
            r4.<init>(r5)
            java.util.Iterator r3 = r3.iterator()
        L44:
            boolean r5 = r3.hasNext()
            r6 = 0
            if (r5 == 0) goto L77
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            int r7 = r5.length()
        L55:
            r8 = -1
            if (r6 >= r7) goto L68
            char r9 = r5.charAt(r6)
            boolean r9 = gh.C2390b.m6128r(r9)
            r9 = r9 ^ 1
            if (r9 == 0) goto L65
            goto L69
        L65:
            int r6 = r6 + 1
            goto L55
        L68:
            r6 = -1
        L69:
            if (r6 != r8) goto L6f
            int r6 = r5.length()
        L6f:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r4.add(r5)
            goto L44
        L77:
            p214m2.C4339q.m9706k(r4, r0)
            java.util.Iterator r3 = r4.iterator()
            boolean r4 = r3.hasNext()
            r5 = 0
            if (r4 != 0) goto L87
            r4 = r5
            goto La1
        L87:
            java.lang.Object r4 = r3.next()
            java.lang.Comparable r4 = (java.lang.Comparable) r4
        L8d:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto La1
            java.lang.Object r6 = r3.next()
            java.lang.Comparable r6 = (java.lang.Comparable) r6
            int r7 = r4.compareTo(r6)
            if (r7 <= 0) goto L8d
            r4 = r6
            goto L8d
        La1:
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto Laa
            int r3 = r4.intValue()
            goto Lab
        Laa:
            r3 = 0
        Lab:
            int r15 = r15.length()
            int r4 = r2.size()
            int r4 = r4 * 0
            int r4 = r4 + r15
            mh.l r15 = m13045B(r1)
            int r1 = p074e9.C1805a.m4527l(r2)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r2 = r2.iterator()
            r7 = 0
        Lc8:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L126
            java.lang.Object r8 = r2.next()
            int r9 = r7 + 1
            if (r7 < 0) goto L122
            java.lang.String r8 = (java.lang.String) r8
            if (r7 == 0) goto Ldc
            if (r7 != r1) goto Le4
        Ldc:
            boolean r7 = p362uh.C6463i.m13054K(r8)
            if (r7 == 0) goto Le4
            r8 = r5
            goto L109
        Le4:
            p214m2.C4339q.m9706k(r8, r0)
            if (r3 < 0) goto Leb
            r7 = 1
            goto Lec
        Leb:
            r7 = 0
        Lec:
            if (r7 == 0) goto L110
            int r7 = r8.length()
            if (r3 <= r7) goto Lf5
            goto Lf6
        Lf5:
            r7 = r3
        Lf6:
            java.lang.String r7 = r8.substring(r7)
            java.lang.String r10 = "this as java.lang.String).substring(startIndex)"
            p214m2.C4339q.m9705j(r7, r10)
            java.lang.Object r7 = r15.mo107b(r7)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L108
            goto L109
        L108:
            r8 = r7
        L109:
            if (r8 == 0) goto L10e
            r6.add(r8)
        L10e:
            r7 = r9
            goto Lc8
        L110:
            java.lang.String r15 = "Requested character count "
            java.lang.String r0 = " is less than zero."
            java.lang.String r15 = android.support.v4.media.C0146e.m258a(r15, r3, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r15 = r15.toString()
            r0.<init>(r15)
            throw r0
        L122:
            p074e9.C1805a.m4539x()
            throw r5
        L126:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>(r4)
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 124(0x7c, float:1.74E-43)
            java.lang.String r8 = "\n"
            r7 = r15
            p062dh.C1473i.m3999K(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.String r15 = r15.toString()
            java.lang.String r0 = "mapIndexedNotNull { inde\u2026\"\\n\")\n        .toString()"
            p214m2.C4339q.m9705j(r15, r0)
            return r15
    }

    /* renamed from: D */
    public static java.lang.String m13047D(java.lang.String r13, java.lang.String r14, int r15) {
            r14 = r15 & 1
            r15 = 0
            if (r14 == 0) goto L8
            java.lang.String r14 = "|"
            goto L9
        L8:
            r14 = r15
        L9:
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r13, r0)
            java.lang.String r0 = "marginPrefix"
            p214m2.C4339q.m9706k(r14, r0)
            boolean r0 = p362uh.C6463i.m13054K(r14)
            r0 = r0 ^ 1
            if (r0 == 0) goto Lc1
            java.util.List r0 = p362uh.C6467m.m13073d0(r13)
            int r13 = r13.length()
            int r1 = r0.size()
            r2 = 0
            int r1 = r1 * 0
            int r1 = r1 + r13
            java.lang.String r13 = ""
            mh.l r13 = m13045B(r13)
            int r3 = p074e9.C1805a.m4527l(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
            r5 = 0
        L3f:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto La5
            java.lang.Object r6 = r0.next()
            int r7 = r5 + 1
            if (r5 < 0) goto La1
            java.lang.String r6 = (java.lang.String) r6
            if (r5 == 0) goto L53
            if (r5 != r3) goto L5b
        L53:
            boolean r5 = p362uh.C6463i.m13054K(r6)
            if (r5 == 0) goto L5b
            r6 = r15
            goto L9a
        L5b:
            int r5 = r6.length()
            r8 = 0
        L60:
            r9 = -1
            if (r8 >= r5) goto L73
            char r10 = r6.charAt(r8)
            boolean r10 = gh.C2390b.m6128r(r10)
            r10 = r10 ^ 1
            if (r10 == 0) goto L70
            goto L74
        L70:
            int r8 = r8 + 1
            goto L60
        L73:
            r8 = -1
        L74:
            if (r8 != r9) goto L77
            goto L8d
        L77:
            r5 = 4
            boolean r5 = p362uh.C6463i.m13060Q(r6, r14, r8, r2, r5)
            if (r5 == 0) goto L8d
            int r5 = r14.length()
            int r5 = r5 + r8
            java.lang.String r5 = r6.substring(r5)
            java.lang.String r8 = "this as java.lang.String).substring(startIndex)"
            p214m2.C4339q.m9705j(r5, r8)
            goto L8e
        L8d:
            r5 = r15
        L8e:
            if (r5 == 0) goto L9a
            java.lang.Object r5 = r13.mo107b(r5)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L99
            goto L9a
        L99:
            r6 = r5
        L9a:
            if (r6 == 0) goto L9f
            r4.add(r6)
        L9f:
            r5 = r7
            goto L3f
        La1:
            p074e9.C1805a.m4539x()
            throw r15
        La5:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r1)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 124(0x7c, float:1.74E-43)
            java.lang.String r6 = "\n"
            r5 = r13
            p062dh.C1473i.m3999K(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.String r13 = r13.toString()
            java.lang.String r14 = "mapIndexedNotNull { inde\u2026\"\\n\")\n        .toString()"
            p214m2.C4339q.m9705j(r13, r14)
            return r13
        Lc1:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "marginPrefix must be non-blank string."
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
    }
}
