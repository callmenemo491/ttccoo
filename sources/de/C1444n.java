package de;

/* renamed from: de.n */
/* loaded from: classes.dex */
public final class C1444n {

    /* renamed from: d */
    public static final androidx.recyclerview.widget.C0604o.e<de.C1444n> f7162d = null;

    /* renamed from: a */
    public final io.tacocrypto.app.p156ui.secret.EnumC3251c f7163a;

    /* renamed from: b */
    public final io.tacocrypto.app.p156ui.secret.EnumC3250b f7164b;

    /* renamed from: c */
    public final md.C4580t0 f7165c;

    /* renamed from: de.n$a */
    public static final class a extends androidx.recyclerview.widget.C0604o.e<de.C1444n> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.recyclerview.widget.C0604o.e
        /* renamed from: a */
        public boolean mo2099a(de.C1444n r1, de.C1444n r2) {
                r0 = this;
                de.n r1 = (de.C1444n) r1
                de.n r2 = (de.C1444n) r2
                boolean r1 = p214m2.C4339q.m9702c(r1, r2)
                return r1
        }

        @Override // androidx.recyclerview.widget.C0604o.e
        /* renamed from: b */
        public boolean mo2100b(de.C1444n r1, de.C1444n r2) {
                r0 = this;
                de.n r1 = (de.C1444n) r1
                de.n r2 = (de.C1444n) r2
                io.tacocrypto.app.ui.secret.c r1 = r1.f7163a
                io.tacocrypto.app.ui.secret.c r2 = r2.f7163a
                if (r1 != r2) goto Lc
                r1 = 1
                goto Ld
            Lc:
                r1 = 0
            Ld:
                return r1
        }
    }

    static {
            de.n$a r0 = new de.n$a
            r0.<init>()
            de.C1444n.f7162d = r0
            return
    }

    public C1444n(io.tacocrypto.app.p156ui.secret.EnumC3251c r2, io.tacocrypto.app.p156ui.secret.EnumC3250b r3, md.C4580t0 r4) {
            r1 = this;
            java.lang.String r0 = "toolType"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "stateTool"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.f7163a = r2
            r1.f7164b = r3
            r1.f7165c = r4
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof de.C1444n
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            de.n r5 = (de.C1444n) r5
            io.tacocrypto.app.ui.secret.c r1 = r4.f7163a
            io.tacocrypto.app.ui.secret.c r3 = r5.f7163a
            if (r1 == r3) goto L13
            return r2
        L13:
            io.tacocrypto.app.ui.secret.b r1 = r4.f7164b
            io.tacocrypto.app.ui.secret.b r3 = r5.f7164b
            if (r1 == r3) goto L1a
            return r2
        L1a:
            md.t0 r1 = r4.f7165c
            md.t0 r5 = r5.f7165c
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L25
            return r2
        L25:
            return r0
    }

    public int hashCode() {
            r2 = this;
            io.tacocrypto.app.ui.secret.c r0 = r2.f7163a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            io.tacocrypto.app.ui.secret.b r1 = r2.f7164b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            md.t0 r0 = r2.f7165c
            if (r0 != 0) goto L17
            r0 = 0
            goto L1b
        L17:
            int r0 = r0.hashCode()
        L1b:
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "ToolUi(toolType="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            io.tacocrypto.app.ui.secret.c r1 = r2.f7163a
            r0.append(r1)
            java.lang.String r1 = ", stateTool="
            r0.append(r1)
            io.tacocrypto.app.ui.secret.b r1 = r2.f7164b
            r0.append(r1)
            java.lang.String r1 = ", secretToolModel="
            r0.append(r1)
            md.t0 r1 = r2.f7165c
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
