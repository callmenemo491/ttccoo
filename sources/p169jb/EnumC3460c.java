package p169jb;

/* renamed from: jb.c */
/* loaded from: classes.dex */
public enum EnumC3460c extends java.lang.Enum<p169jb.EnumC3460c> implements p169jb.InterfaceC3461d {

    /* renamed from: Y */
    public static final p169jb.EnumC3460c f14935Y = null;

    /* renamed from: Z */
    public static final /* synthetic */ p169jb.EnumC3460c[] f14936Z = null;

    /* renamed from: jb.c$a */
    public enum a extends p169jb.EnumC3460c {
        public a(java.lang.String r2, int r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r3, r0)
                return
        }

        @Override // p169jb.InterfaceC3461d
        /* renamed from: e */
        public java.lang.String mo7926e(java.lang.reflect.Field r1) {
                r0 = this;
                java.lang.String r1 = r1.getName()
                return r1
        }
    }






    static {
            jb.c$a r0 = new jb.c$a
            java.lang.String r1 = "IDENTITY"
            r2 = 0
            r0.<init>(r1, r2)
            p169jb.EnumC3460c.f14935Y = r0
            jb.c$b r1 = new jb.c$b
            java.lang.String r3 = "UPPER_CAMEL_CASE"
            r4 = 1
            r1.<init>(r3, r4)
            jb.c$c r3 = new jb.c$c
            java.lang.String r5 = "UPPER_CAMEL_CASE_WITH_SPACES"
            r6 = 2
            r3.<init>(r5, r6)
            jb.c$d r5 = new jb.c$d
            java.lang.String r7 = "LOWER_CASE_WITH_UNDERSCORES"
            r8 = 3
            r5.<init>(r7, r8)
            jb.c$e r7 = new jb.c$e
            java.lang.String r9 = "LOWER_CASE_WITH_DASHES"
            r10 = 4
            r7.<init>(r9, r10)
            jb.c$f r9 = new jb.c$f
            java.lang.String r11 = "LOWER_CASE_WITH_DOTS"
            r12 = 5
            r9.<init>(r11, r12)
            r11 = 6
            jb.c[] r11 = new p169jb.EnumC3460c[r11]
            r11[r2] = r0
            r11[r4] = r1
            r11[r6] = r3
            r11[r8] = r5
            r11[r10] = r7
            r11[r12] = r9
            p169jb.EnumC3460c.f14936Z = r11
            return
    }

    EnumC3460c(java.lang.String r1, int r2, p169jb.EnumC3460c.a r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    /* renamed from: g */
    public static java.lang.String m7924g(java.lang.String r5, java.lang.String r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r5.length()
            r2 = 0
        La:
            if (r2 >= r1) goto L25
            char r3 = r5.charAt(r2)
            boolean r4 = java.lang.Character.isUpperCase(r3)
            if (r4 == 0) goto L1f
            int r4 = r0.length()
            if (r4 == 0) goto L1f
            r0.append(r6)
        L1f:
            r0.append(r3)
            int r2 = r2 + 1
            goto La
        L25:
            java.lang.String r5 = r0.toString()
            return r5
    }

    /* renamed from: h */
    public static java.lang.String m7925h(java.lang.String r5) {
            int r0 = r5.length()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = 0
        L8:
            char r4 = r5.charAt(r3)
            boolean r4 = java.lang.Character.isLetter(r4)
            if (r4 != 0) goto L17
            if (r3 >= r0) goto L17
            int r3 = r3 + 1
            goto L8
        L17:
            char r0 = r5.charAt(r3)
            boolean r4 = java.lang.Character.isUpperCase(r0)
            if (r4 == 0) goto L22
            return r5
        L22:
            char r0 = java.lang.Character.toUpperCase(r0)
            if (r3 != 0) goto L38
            java.lang.StringBuilder r0 = p367v1.C6487a.m13176a(r0)
            java.lang.String r5 = r5.substring(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
        L38:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r2 = r5.substring(r2, r3)
            r4.append(r2)
            r4.append(r0)
            int r3 = r3 + r1
            java.lang.String r5 = r5.substring(r3)
            r4.append(r5)
            java.lang.String r5 = r4.toString()
            return r5
    }

    public static p169jb.EnumC3460c valueOf(java.lang.String r1) {
            java.lang.Class<jb.c> r0 = p169jb.EnumC3460c.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            jb.c r1 = (p169jb.EnumC3460c) r1
            return r1
    }

    public static p169jb.EnumC3460c[] values() {
            jb.c[] r0 = p169jb.EnumC3460c.f14936Z
            java.lang.Object r0 = r0.clone()
            jb.c[] r0 = (p169jb.EnumC3460c[]) r0
            return r0
    }
}
