package p154ii;

/* renamed from: ii.e */
/* loaded from: classes.dex */
public final class C3178e {

    /* renamed from: a */
    public static final p260oi.C5287i f12710a = null;

    /* renamed from: b */
    public static final java.lang.String[] f12711b = null;

    /* renamed from: c */
    public static final java.lang.String[] f12712c = null;

    /* renamed from: d */
    public static final java.lang.String[] f12713d = null;

    /* renamed from: e */
    public static final p154ii.C3178e f12714e = null;

    static {
            ii.e r0 = new ii.e
            r0.<init>()
            p154ii.C3178e.f12714e = r0
            oi.i$a r0 = p260oi.C5287i.f20505c0
            java.lang.String r1 = "PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n"
            oi.i r0 = r0.m11596b(r1)
            p154ii.C3178e.f12710a = r0
            java.lang.String r1 = "DATA"
            java.lang.String r2 = "HEADERS"
            java.lang.String r3 = "PRIORITY"
            java.lang.String r4 = "RST_STREAM"
            java.lang.String r5 = "SETTINGS"
            java.lang.String r6 = "PUSH_PROMISE"
            java.lang.String r7 = "PING"
            java.lang.String r8 = "GOAWAY"
            java.lang.String r9 = "WINDOW_UPDATE"
            java.lang.String r10 = "CONTINUATION"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10}
            p154ii.C3178e.f12711b = r0
            r0 = 64
            java.lang.String[] r0 = new java.lang.String[r0]
            p154ii.C3178e.f12712c = r0
            r0 = 256(0x100, float:3.59E-43)
            java.lang.String[] r1 = new java.lang.String[r0]
            r2 = 0
            r3 = 0
        L37:
            r4 = 4
            r5 = 32
            r6 = 1
            if (r3 >= r0) goto L5b
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r7 = java.lang.Integer.toBinaryString(r3)
            java.lang.String r8 = "Integer.toBinaryString(it)"
            p214m2.C4339q.m9705j(r7, r8)
            r6[r2] = r7
            java.lang.String r7 = "%8s"
            java.lang.String r6 = ci.C0988c.m2703h(r7, r6)
            r7 = 48
            java.lang.String r4 = p362uh.C6463i.m13056M(r6, r5, r7, r2, r4)
            r1[r3] = r4
            int r3 = r3 + 1
            goto L37
        L5b:
            p154ii.C3178e.f12713d = r1
            java.lang.String[] r0 = p154ii.C3178e.f12712c
            java.lang.String r1 = ""
            r0[r2] = r1
            java.lang.String r1 = "END_STREAM"
            r0[r6] = r1
            int[] r1 = new int[r6]
            r1[r2] = r6
            java.lang.String r3 = "PADDED"
            r7 = 8
            r0[r7] = r3
            r0 = 0
        L72:
            java.lang.String r3 = "|PADDED"
            if (r0 >= r6) goto L87
            r8 = r1[r0]
            java.lang.String[] r9 = p154ii.C3178e.f12712c
            r10 = r8 | 8
            r8 = r9[r8]
            java.lang.String r3 = p214m2.C4339q.m9711u(r8, r3)
            r9[r10] = r3
            int r0 = r0 + 1
            goto L72
        L87:
            java.lang.String[] r0 = p154ii.C3178e.f12712c
            java.lang.String r8 = "END_HEADERS"
            r0[r4] = r8
            java.lang.String r4 = "PRIORITY"
            r0[r5] = r4
            r4 = 36
            java.lang.String r5 = "END_HEADERS|PRIORITY"
            r0[r4] = r5
            r0 = 3
            int[] r4 = new int[r0]
            r4 = {x00f6: FILL_ARRAY_DATA , data: [4, 32, 36} // fill-array
            r5 = 0
        L9e:
            if (r5 >= r0) goto Le1
            r8 = r4[r5]
            r9 = 0
        La3:
            if (r9 >= r6) goto Lde
            r10 = r1[r9]
            java.lang.String[] r11 = p154ii.C3178e.f12712c
            r12 = r10 | r8
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r14 = r11[r10]
            r13.append(r14)
            java.lang.String r14 = "|"
            r13.append(r14)
            r15 = r11[r8]
            r13.append(r15)
            java.lang.String r13 = r13.toString()
            r11[r12] = r13
            r12 = r12 | r7
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r10 = r11[r10]
            r13.append(r10)
            r13.append(r14)
            r10 = r11[r8]
            java.lang.String r10 = p346u.C6269n.m12888a(r13, r10, r3)
            r11[r12] = r10
            int r9 = r9 + 1
            goto La3
        Lde:
            int r5 = r5 + 1
            goto L9e
        Le1:
            java.lang.String[] r0 = p154ii.C3178e.f12712c
            int r0 = r0.length
        Le4:
            if (r2 >= r0) goto Lf5
            java.lang.String[] r1 = p154ii.C3178e.f12712c
            r3 = r1[r2]
            if (r3 != 0) goto Lf2
            java.lang.String[] r3 = p154ii.C3178e.f12713d
            r3 = r3[r2]
            r1[r2] = r3
        Lf2:
            int r2 = r2 + 1
            goto Le4
        Lf5:
            return
    }

    public C3178e() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public final java.lang.String m7626a(int r3) {
            r2 = this;
            java.lang.String[] r0 = p154ii.C3178e.f12711b
            int r1 = r0.length
            if (r3 >= r1) goto L8
            r3 = r0[r3]
            goto L18
        L8:
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r1] = r3
            java.lang.String r3 = "0x%02x"
            java.lang.String r3 = ci.C0988c.m2703h(r3, r0)
        L18:
            return r3
    }

    /* renamed from: b */
    public final java.lang.String m7627b(boolean r10, int r11, int r12, int r13, int r14) {
            r9 = this;
            java.lang.String r0 = r9.m7626a(r13)
            r1 = 0
            r2 = 5
            r3 = 1
            r4 = 3
            r5 = 2
            r6 = 4
            if (r14 != 0) goto Lf
            java.lang.String r13 = ""
            goto L58
        Lf:
            if (r13 == r5) goto L54
            if (r13 == r4) goto L54
            if (r13 == r6) goto L4a
            r7 = 6
            if (r13 == r7) goto L4a
            r7 = 7
            if (r13 == r7) goto L54
            r7 = 8
            if (r13 == r7) goto L54
            java.lang.String[] r7 = p154ii.C3178e.f12712c
            int r8 = r7.length
            if (r14 >= r8) goto L2a
            r7 = r7[r14]
            p214m2.C4339q.m9704i(r7)
            goto L2e
        L2a:
            java.lang.String[] r7 = p154ii.C3178e.f12713d
            r7 = r7[r14]
        L2e:
            if (r13 != r2) goto L39
            r8 = r14 & 4
            if (r8 == 0) goto L39
            java.lang.String r13 = "HEADERS"
            java.lang.String r14 = "PUSH_PROMISE"
            goto L43
        L39:
            if (r13 != 0) goto L48
            r13 = r14 & 32
            if (r13 == 0) goto L48
            java.lang.String r13 = "PRIORITY"
            java.lang.String r14 = "COMPRESSED"
        L43:
            java.lang.String r13 = p362uh.C6463i.m13057N(r7, r13, r14, r1, r6)
            goto L58
        L48:
            r13 = r7
            goto L58
        L4a:
            if (r14 != r3) goto L4f
            java.lang.String r13 = "ACK"
            goto L58
        L4f:
            java.lang.String[] r13 = p154ii.C3178e.f12713d
            r13 = r13[r14]
            goto L58
        L54:
            java.lang.String[] r13 = p154ii.C3178e.f12713d
            r13 = r13[r14]
        L58:
            if (r10 == 0) goto L5d
            java.lang.String r10 = "<<"
            goto L5f
        L5d:
            java.lang.String r10 = ">>"
        L5f:
            java.lang.Object[] r14 = new java.lang.Object[r2]
            r14[r1] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            r14[r3] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
            r14[r5] = r10
            r14[r4] = r0
            r14[r6] = r13
            java.lang.String r10 = "%s 0x%08x %5d %-13s %s"
            java.lang.String r10 = ci.C0988c.m2703h(r10, r14)
            return r10
    }
}
