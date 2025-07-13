package p427y4;

/* renamed from: y4.d */
/* loaded from: classes.dex */
public interface InterfaceC7113d {

    /* renamed from: a */
    public static final p427y4.InterfaceC7113d f27507a = null;

    /* renamed from: y4.d$a */
    public class a implements p427y4.InterfaceC7113d {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p427y4.InterfaceC7113d
        /* renamed from: a */
        public p427y4.InterfaceC7112c mo14225a(p088f4.C2003e0 r4) {
                r3 = this;
                java.lang.String r4 = r4.f8896j0
                if (r4 == 0) goto L65
                r0 = -1
                int r1 = r4.hashCode()
                switch(r1) {
                    case -1354451219: goto L39;
                    case -1348231605: goto L2e;
                    case -1248341703: goto L23;
                    case 1154383568: goto L18;
                    case 1652648887: goto Ld;
                    default: goto Lc;
                }
            Lc:
                goto L43
            Ld:
                java.lang.String r1 = "application/x-scte35"
                boolean r1 = r4.equals(r1)
                if (r1 != 0) goto L16
                goto L43
            L16:
                r0 = 4
                goto L43
            L18:
                java.lang.String r1 = "application/x-emsg"
                boolean r1 = r4.equals(r1)
                if (r1 != 0) goto L21
                goto L43
            L21:
                r0 = 3
                goto L43
            L23:
                java.lang.String r1 = "application/id3"
                boolean r1 = r4.equals(r1)
                if (r1 != 0) goto L2c
                goto L43
            L2c:
                r0 = 2
                goto L43
            L2e:
                java.lang.String r1 = "application/x-icy"
                boolean r1 = r4.equals(r1)
                if (r1 != 0) goto L37
                goto L43
            L37:
                r0 = 1
                goto L43
            L39:
                java.lang.String r1 = "application/vnd.dvb.ait"
                boolean r1 = r4.equals(r1)
                if (r1 != 0) goto L42
                goto L43
            L42:
                r0 = 0
            L43:
                switch(r0) {
                    case 0: goto L5f;
                    case 1: goto L59;
                    case 2: goto L53;
                    case 3: goto L4d;
                    case 4: goto L47;
                    default: goto L46;
                }
            L46:
                goto L65
            L47:
                f5.c r4 = new f5.c
                r4.<init>()
                return r4
            L4d:
                a5.b r4 = new a5.b
                r4.<init>()
                return r4
            L53:
                d5.g r4 = new d5.g
                r4.<init>()
                return r4
            L59:
                c5.a r4 = new c5.a
                r4.<init>()
                return r4
            L5f:
                z4.b r4 = new z4.b
                r4.<init>()
                return r4
            L65:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Attempted to create decoder for unsupported MIME type: "
                java.lang.String r4 = java.lang.String.valueOf(r4)
                int r2 = r4.length()
                if (r2 == 0) goto L78
                java.lang.String r4 = r1.concat(r4)
                goto L7d
            L78:
                java.lang.String r4 = new java.lang.String
                r4.<init>(r1)
            L7d:
                r0.<init>(r4)
                throw r0
        }

        @Override // p427y4.InterfaceC7113d
        /* renamed from: f */
        public boolean mo14226f(p088f4.C2003e0 r2) {
                r1 = this;
                java.lang.String r2 = r2.f8896j0
                java.lang.String r0 = "application/id3"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L2d
                java.lang.String r0 = "application/x-emsg"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L2d
                java.lang.String r0 = "application/x-scte35"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L2d
                java.lang.String r0 = "application/x-icy"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L2d
                java.lang.String r0 = "application/vnd.dvb.ait"
                boolean r2 = r0.equals(r2)
                if (r2 == 0) goto L2b
                goto L2d
            L2b:
                r2 = 0
                goto L2e
            L2d:
                r2 = 1
            L2e:
                return r2
        }
    }

    static {
            y4.d$a r0 = new y4.d$a
            r0.<init>()
            p427y4.InterfaceC7113d.f27507a = r0
            return
    }

    /* renamed from: a */
    p427y4.InterfaceC7112c mo14225a(p088f4.C2003e0 r1);

    /* renamed from: f */
    boolean mo14226f(p088f4.C2003e0 r1);
}
