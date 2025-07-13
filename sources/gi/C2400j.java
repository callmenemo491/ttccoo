package gi;

/* renamed from: gi.j */
/* loaded from: classes.dex */
public final class C2400j {

    /* renamed from: a */
    public final bi.EnumC0773b0 f10794a;

    /* renamed from: b */
    public final int f10795b;

    /* renamed from: c */
    public final java.lang.String f10796c;

    public C2400j(bi.EnumC0773b0 r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.f10794a = r1
            r0.f10795b = r2
            r0.f10796c = r3
            return
    }

    /* renamed from: a */
    public static final gi.C2400j m6154a(java.lang.String r7) {
            bi.b0 r0 = bi.EnumC0773b0.f4184Z
            java.lang.String r1 = "statusLine"
            p214m2.C4339q.m9706k(r7, r1)
            java.lang.String r1 = "HTTP/1."
            r2 = 0
            r3 = 2
            boolean r1 = p362uh.C6463i.m13061R(r7, r1, r2, r3)
            r4 = 32
            r5 = 9
            java.lang.String r6 = "Unexpected status line: "
            if (r1 == 0) goto L49
            int r1 = r7.length()
            if (r1 < r5) goto L3f
            r1 = 8
            char r1 = r7.charAt(r1)
            if (r1 != r4) goto L3f
            r1 = 7
            char r1 = r7.charAt(r1)
            int r1 = r1 + (-48)
            if (r1 != 0) goto L2f
            goto L52
        L2f:
            r0 = 1
            if (r1 != r0) goto L35
            bi.b0 r0 = bi.EnumC0773b0.f4185a0
            goto L52
        L35:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r7 = p064e.C1493g.m4049a(r6, r7)
            r0.<init>(r7)
            throw r0
        L3f:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r7 = p064e.C1493g.m4049a(r6, r7)
            r0.<init>(r7)
            throw r0
        L49:
            java.lang.String r1 = "ICY "
            boolean r1 = p362uh.C6463i.m13061R(r7, r1, r2, r3)
            if (r1 == 0) goto La5
            r5 = 4
        L52:
            int r1 = r7.length()
            int r2 = r5 + 3
            if (r1 < r2) goto L9b
            java.lang.String r1 = r7.substring(r5, r2)     // Catch: java.lang.NumberFormatException -> L91
            java.lang.String r3 = "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"
            p214m2.C4339q.m9705j(r1, r3)     // Catch: java.lang.NumberFormatException -> L91
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L91
            int r3 = r7.length()
            if (r3 <= r2) goto L89
            char r2 = r7.charAt(r2)
            if (r2 != r4) goto L7f
            int r5 = r5 + 4
            java.lang.String r7 = r7.substring(r5)
            java.lang.String r2 = "(this as java.lang.String).substring(startIndex)"
            p214m2.C4339q.m9705j(r7, r2)
            goto L8b
        L7f:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r7 = p064e.C1493g.m4049a(r6, r7)
            r0.<init>(r7)
            throw r0
        L89:
            java.lang.String r7 = ""
        L8b:
            gi.j r2 = new gi.j
            r2.<init>(r0, r1, r7)
            return r2
        L91:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r7 = p064e.C1493g.m4049a(r6, r7)
            r0.<init>(r7)
            throw r0
        L9b:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r7 = p064e.C1493g.m4049a(r6, r7)
            r0.<init>(r7)
            throw r0
        La5:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r7 = p064e.C1493g.m4049a(r6, r7)
            r0.<init>(r7)
            throw r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            bi.b0 r1 = r3.f10794a
            bi.b0 r2 = bi.EnumC0773b0.f4184Z
            if (r1 != r2) goto Le
            java.lang.String r1 = "HTTP/1.0"
            goto L10
        Le:
            java.lang.String r1 = "HTTP/1.1"
        L10:
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            int r2 = r3.f10795b
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = r3.f10796c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            p214m2.C4339q.m9705j(r0, r1)
            return r0
    }
}
