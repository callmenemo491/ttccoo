package p154ii;

/* renamed from: ii.c */
/* loaded from: classes.dex */
public final class C3176c {

    /* renamed from: d */
    public static final p260oi.C5287i f12681d = null;

    /* renamed from: e */
    public static final p260oi.C5287i f12682e = null;

    /* renamed from: f */
    public static final p260oi.C5287i f12683f = null;

    /* renamed from: g */
    public static final p260oi.C5287i f12684g = null;

    /* renamed from: h */
    public static final p260oi.C5287i f12685h = null;

    /* renamed from: i */
    public static final p260oi.C5287i f12686i = null;

    /* renamed from: a */
    public final int f12687a;

    /* renamed from: b */
    public final p260oi.C5287i f12688b;

    /* renamed from: c */
    public final p260oi.C5287i f12689c;

    static {
            oi.i$a r0 = p260oi.C5287i.f20505c0
            java.lang.String r1 = ":"
            oi.i r1 = r0.m11596b(r1)
            p154ii.C3176c.f12681d = r1
            java.lang.String r1 = ":status"
            oi.i r1 = r0.m11596b(r1)
            p154ii.C3176c.f12682e = r1
            java.lang.String r1 = ":method"
            oi.i r1 = r0.m11596b(r1)
            p154ii.C3176c.f12683f = r1
            java.lang.String r1 = ":path"
            oi.i r1 = r0.m11596b(r1)
            p154ii.C3176c.f12684g = r1
            java.lang.String r1 = ":scheme"
            oi.i r1 = r0.m11596b(r1)
            p154ii.C3176c.f12685h = r1
            java.lang.String r1 = ":authority"
            oi.i r0 = r0.m11596b(r1)
            p154ii.C3176c.f12686i = r0
            return
    }

    public C3176c(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "name"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "value"
            p214m2.C4339q.m9706k(r3, r0)
            oi.i$a r0 = p260oi.C5287i.f20505c0
            oi.i r2 = r0.m11596b(r2)
            oi.i r3 = r0.m11596b(r3)
            r1.<init>(r2, r3)
            return
    }

    public C3176c(p260oi.C5287i r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "name"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "value"
            p214m2.C4339q.m9706k(r3, r0)
            oi.i$a r0 = p260oi.C5287i.f20505c0
            oi.i r3 = r0.m11596b(r3)
            r1.<init>(r2, r3)
            return
    }

    public C3176c(p260oi.C5287i r2, p260oi.C5287i r3) {
            r1 = this;
            java.lang.String r0 = "name"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "value"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.f12688b = r2
            r1.f12689c = r3
            int r2 = r2.mo11585h()
            int r2 = r2 + 32
            int r3 = r3.mo11585h()
            int r2 = r2 + r3
            r1.f12687a = r2
            return
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 == r3) goto L1f
            boolean r0 = r3 instanceof p154ii.C3176c
            if (r0 == 0) goto L1d
            ii.c r3 = (p154ii.C3176c) r3
            oi.i r0 = r2.f12688b
            oi.i r1 = r3.f12688b
            boolean r0 = p214m2.C4339q.m9702c(r0, r1)
            if (r0 == 0) goto L1d
            oi.i r0 = r2.f12689c
            oi.i r3 = r3.f12689c
            boolean r3 = p214m2.C4339q.m9702c(r0, r3)
            if (r3 == 0) goto L1d
            goto L1f
        L1d:
            r3 = 0
            return r3
        L1f:
            r3 = 1
            return r3
    }

    public int hashCode() {
            r3 = this;
            oi.i r0 = r3.f12688b
            r1 = 0
            if (r0 == 0) goto La
            int r0 = r0.hashCode()
            goto Lb
        La:
            r0 = 0
        Lb:
            int r0 = r0 * 31
            oi.i r2 = r3.f12689c
            if (r2 == 0) goto L15
            int r1 = r2.hashCode()
        L15:
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            oi.i r1 = r2.f12688b
            java.lang.String r1 = r1.m11592s()
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            oi.i r1 = r2.f12689c
            java.lang.String r1 = r1.m11592s()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
