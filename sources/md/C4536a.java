package md;

/* renamed from: md.a */
/* loaded from: classes.dex */
public final class C4536a {

    @p189kb.InterfaceC4079b("core_liquid_balance")
    private final java.lang.String coreLiquidBalance;

    @p189kb.InterfaceC4079b("cpu_limit")
    private final md.C4581u cpuLimit;

    @p189kb.InterfaceC4079b("net_limit")
    private final md.C4581u netLimit;
    private final java.util.List<md.C4536a.a> permissions;

    @p189kb.InterfaceC4079b("ram_quota")
    private final long ramQuota;

    @p189kb.InterfaceC4079b("ram_usage")
    private final long ramUsage;

    @p189kb.InterfaceC4079b("voter_info")
    private final md.C4550e1 voterInfo;

    /* renamed from: md.a$a */
    public static final class a {
        private final java.lang.String perm_name;
        private final md.C4536a.a.C7407a required_auth;

        /* renamed from: md.a$a$a, reason: collision with other inner class name */
        public static final class C7407a {
            private final java.util.List<md.C4536a.a.C7407a.C7408a> keys;

            /* renamed from: md.a$a$a$a, reason: collision with other inner class name */
            public static final class C7408a {
                private final java.lang.String key;

                public C7408a(java.lang.String r2) {
                        r1 = this;
                        java.lang.String r0 = "key"
                        p214m2.C4339q.m9706k(r2, r0)
                        r1.<init>()
                        r1.key = r2
                        return
                }

                public static /* synthetic */ md.C4536a.a.C7407a.C7408a copy$default(md.C4536a.a.C7407a.C7408a r0, java.lang.String r1, int r2, java.lang.Object r3) {
                        r2 = r2 & 1
                        if (r2 == 0) goto L6
                        java.lang.String r1 = r0.key
                    L6:
                        md.a$a$a$a r0 = r0.copy(r1)
                        return r0
                }

                public final java.lang.String component1() {
                        r1 = this;
                        java.lang.String r0 = r1.key
                        return r0
                }

                public final md.C4536a.a.C7407a.C7408a copy(java.lang.String r2) {
                        r1 = this;
                        java.lang.String r0 = "key"
                        p214m2.C4339q.m9706k(r2, r0)
                        md.a$a$a$a r0 = new md.a$a$a$a
                        r0.<init>(r2)
                        return r0
                }

                public boolean equals(java.lang.Object r4) {
                        r3 = this;
                        r0 = 1
                        if (r3 != r4) goto L4
                        return r0
                    L4:
                        boolean r1 = r4 instanceof md.C4536a.a.C7407a.C7408a
                        r2 = 0
                        if (r1 != 0) goto La
                        return r2
                    La:
                        md.a$a$a$a r4 = (md.C4536a.a.C7407a.C7408a) r4
                        java.lang.String r1 = r3.key
                        java.lang.String r4 = r4.key
                        boolean r4 = p214m2.C4339q.m9702c(r1, r4)
                        if (r4 != 0) goto L17
                        return r2
                    L17:
                        return r0
                }

                public final java.lang.String getKey() {
                        r1 = this;
                        java.lang.String r0 = r1.key
                        return r0
                }

                public int hashCode() {
                        r1 = this;
                        java.lang.String r0 = r1.key
                        int r0 = r0.hashCode()
                        return r0
                }

                public java.lang.String toString() {
                        r3 = this;
                        java.lang.String r0 = "Key(key="
                        java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                        java.lang.String r1 = r3.key
                        r2 = 41
                        java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
                        return r0
                }
            }

            public C7407a(java.util.List<md.C4536a.a.C7407a.C7408a> r2) {
                    r1 = this;
                    java.lang.String r0 = "keys"
                    p214m2.C4339q.m9706k(r2, r0)
                    r1.<init>()
                    r1.keys = r2
                    return
            }

            public static /* synthetic */ md.C4536a.a.C7407a copy$default(md.C4536a.a.C7407a r0, java.util.List r1, int r2, java.lang.Object r3) {
                    r2 = r2 & 1
                    if (r2 == 0) goto L6
                    java.util.List<md.a$a$a$a> r1 = r0.keys
                L6:
                    md.a$a$a r0 = r0.copy(r1)
                    return r0
            }

            public final java.util.List<md.C4536a.a.C7407a.C7408a> component1() {
                    r1 = this;
                    java.util.List<md.a$a$a$a> r0 = r1.keys
                    return r0
            }

            public final md.C4536a.a.C7407a copy(java.util.List<md.C4536a.a.C7407a.C7408a> r2) {
                    r1 = this;
                    java.lang.String r0 = "keys"
                    p214m2.C4339q.m9706k(r2, r0)
                    md.a$a$a r0 = new md.a$a$a
                    r0.<init>(r2)
                    return r0
            }

            public boolean equals(java.lang.Object r4) {
                    r3 = this;
                    r0 = 1
                    if (r3 != r4) goto L4
                    return r0
                L4:
                    boolean r1 = r4 instanceof md.C4536a.a.C7407a
                    r2 = 0
                    if (r1 != 0) goto La
                    return r2
                La:
                    md.a$a$a r4 = (md.C4536a.a.C7407a) r4
                    java.util.List<md.a$a$a$a> r1 = r3.keys
                    java.util.List<md.a$a$a$a> r4 = r4.keys
                    boolean r4 = p214m2.C4339q.m9702c(r1, r4)
                    if (r4 != 0) goto L17
                    return r2
                L17:
                    return r0
            }

            public final java.util.List<md.C4536a.a.C7407a.C7408a> getKeys() {
                    r1 = this;
                    java.util.List<md.a$a$a$a> r0 = r1.keys
                    return r0
            }

            public int hashCode() {
                    r1 = this;
                    java.util.List<md.a$a$a$a> r0 = r1.keys
                    int r0 = r0.hashCode()
                    return r0
            }

            public java.lang.String toString() {
                    r3 = this;
                    java.lang.String r0 = "RequiredAuth(keys="
                    java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                    java.util.List<md.a$a$a$a> r1 = r3.keys
                    r2 = 41
                    java.lang.String r0 = p213m1.C4320f.m9652a(r0, r1, r2)
                    return r0
            }
        }

        public a(java.lang.String r2, md.C4536a.a.C7407a r3) {
                r1 = this;
                java.lang.String r0 = "perm_name"
                p214m2.C4339q.m9706k(r2, r0)
                java.lang.String r0 = "required_auth"
                p214m2.C4339q.m9706k(r3, r0)
                r1.<init>()
                r1.perm_name = r2
                r1.required_auth = r3
                return
        }

        public static /* synthetic */ md.C4536a.a copy$default(md.C4536a.a r0, java.lang.String r1, md.C4536a.a.C7407a r2, int r3, java.lang.Object r4) {
                r4 = r3 & 1
                if (r4 == 0) goto L6
                java.lang.String r1 = r0.perm_name
            L6:
                r3 = r3 & 2
                if (r3 == 0) goto Lc
                md.a$a$a r2 = r0.required_auth
            Lc:
                md.a$a r0 = r0.copy(r1, r2)
                return r0
        }

        public final java.lang.String component1() {
                r1 = this;
                java.lang.String r0 = r1.perm_name
                return r0
        }

        public final md.C4536a.a.C7407a component2() {
                r1 = this;
                md.a$a$a r0 = r1.required_auth
                return r0
        }

        public final md.C4536a.a copy(java.lang.String r2, md.C4536a.a.C7407a r3) {
                r1 = this;
                java.lang.String r0 = "perm_name"
                p214m2.C4339q.m9706k(r2, r0)
                java.lang.String r0 = "required_auth"
                p214m2.C4339q.m9706k(r3, r0)
                md.a$a r0 = new md.a$a
                r0.<init>(r2, r3)
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof md.C4536a.a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                md.a$a r5 = (md.C4536a.a) r5
                java.lang.String r1 = r4.perm_name
                java.lang.String r3 = r5.perm_name
                boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                md.a$a$a r1 = r4.required_auth
                md.a$a$a r5 = r5.required_auth
                boolean r5 = p214m2.C4339q.m9702c(r1, r5)
                if (r5 != 0) goto L22
                return r2
            L22:
                return r0
        }

        public final java.lang.String getPerm_name() {
                r1 = this;
                java.lang.String r0 = r1.perm_name
                return r0
        }

        public final md.C4536a.a.C7407a getRequired_auth() {
                r1 = this;
                md.a$a$a r0 = r1.required_auth
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.String r0 = r2.perm_name
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                md.a$a$a r1 = r2.required_auth
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                return r1
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = "Permission(perm_name="
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                java.lang.String r1 = r2.perm_name
                r0.append(r1)
                java.lang.String r1 = ", required_auth="
                r0.append(r1)
                md.a$a$a r1 = r2.required_auth
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public C4536a(long r2, md.C4581u r4, md.C4581u r5, long r6, java.lang.String r8, md.C4550e1 r9, java.util.List<md.C4536a.a> r10) {
            r1 = this;
            java.lang.String r0 = "netLimit"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "cpuLimit"
            p214m2.C4339q.m9706k(r5, r0)
            java.lang.String r0 = "coreLiquidBalance"
            p214m2.C4339q.m9706k(r8, r0)
            java.lang.String r0 = "permissions"
            p214m2.C4339q.m9706k(r10, r0)
            r1.<init>()
            r1.ramQuota = r2
            r1.netLimit = r4
            r1.cpuLimit = r5
            r1.ramUsage = r6
            r1.coreLiquidBalance = r8
            r1.voterInfo = r9
            r1.permissions = r10
            return
    }

    public static /* synthetic */ md.C4536a copy$default(md.C4536a r10, long r11, md.C4581u r13, md.C4581u r14, long r15, java.lang.String r17, md.C4550e1 r18, java.util.List r19, int r20, java.lang.Object r21) {
            r0 = r10
            r1 = r20 & 1
            if (r1 == 0) goto L8
            long r1 = r0.ramQuota
            goto L9
        L8:
            r1 = r11
        L9:
            r3 = r20 & 2
            if (r3 == 0) goto L10
            md.u r3 = r0.netLimit
            goto L11
        L10:
            r3 = r13
        L11:
            r4 = r20 & 4
            if (r4 == 0) goto L18
            md.u r4 = r0.cpuLimit
            goto L19
        L18:
            r4 = r14
        L19:
            r5 = r20 & 8
            if (r5 == 0) goto L20
            long r5 = r0.ramUsage
            goto L21
        L20:
            r5 = r15
        L21:
            r7 = r20 & 16
            if (r7 == 0) goto L28
            java.lang.String r7 = r0.coreLiquidBalance
            goto L2a
        L28:
            r7 = r17
        L2a:
            r8 = r20 & 32
            if (r8 == 0) goto L31
            md.e1 r8 = r0.voterInfo
            goto L33
        L31:
            r8 = r18
        L33:
            r9 = r20 & 64
            if (r9 == 0) goto L3a
            java.util.List<md.a$a> r9 = r0.permissions
            goto L3c
        L3a:
            r9 = r19
        L3c:
            r11 = r1
            r13 = r3
            r14 = r4
            r15 = r5
            r17 = r7
            r18 = r8
            r19 = r9
            md.a r0 = r10.copy(r11, r13, r14, r15, r17, r18, r19)
            return r0
    }

    public final long component1() {
            r2 = this;
            long r0 = r2.ramQuota
            return r0
    }

    public final md.C4581u component2() {
            r1 = this;
            md.u r0 = r1.netLimit
            return r0
    }

    public final md.C4581u component3() {
            r1 = this;
            md.u r0 = r1.cpuLimit
            return r0
    }

    public final long component4() {
            r2 = this;
            long r0 = r2.ramUsage
            return r0
    }

    public final java.lang.String component5() {
            r1 = this;
            java.lang.String r0 = r1.coreLiquidBalance
            return r0
    }

    public final md.C4550e1 component6() {
            r1 = this;
            md.e1 r0 = r1.voterInfo
            return r0
    }

    public final java.util.List<md.C4536a.a> component7() {
            r1 = this;
            java.util.List<md.a$a> r0 = r1.permissions
            return r0
    }

    public final md.C4536a copy(long r12, md.C4581u r14, md.C4581u r15, long r16, java.lang.String r18, md.C4550e1 r19, java.util.List<md.C4536a.a> r20) {
            r11 = this;
            java.lang.String r0 = "netLimit"
            r4 = r14
            p214m2.C4339q.m9706k(r14, r0)
            java.lang.String r0 = "cpuLimit"
            r5 = r15
            p214m2.C4339q.m9706k(r15, r0)
            java.lang.String r0 = "coreLiquidBalance"
            r8 = r18
            p214m2.C4339q.m9706k(r8, r0)
            java.lang.String r0 = "permissions"
            r10 = r20
            p214m2.C4339q.m9706k(r10, r0)
            md.a r0 = new md.a
            r1 = r0
            r2 = r12
            r6 = r16
            r9 = r19
            r1.<init>(r2, r4, r5, r6, r8, r9, r10)
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof md.C4536a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            md.a r8 = (md.C4536a) r8
            long r3 = r7.ramQuota
            long r5 = r8.ramQuota
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L15
            return r2
        L15:
            md.u r1 = r7.netLimit
            md.u r3 = r8.netLimit
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L20
            return r2
        L20:
            md.u r1 = r7.cpuLimit
            md.u r3 = r8.cpuLimit
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L2b
            return r2
        L2b:
            long r3 = r7.ramUsage
            long r5 = r8.ramUsage
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L34
            return r2
        L34:
            java.lang.String r1 = r7.coreLiquidBalance
            java.lang.String r3 = r8.coreLiquidBalance
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L3f
            return r2
        L3f:
            md.e1 r1 = r7.voterInfo
            md.e1 r3 = r8.voterInfo
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L4a
            return r2
        L4a:
            java.util.List<md.a$a> r1 = r7.permissions
            java.util.List<md.a$a> r8 = r8.permissions
            boolean r8 = p214m2.C4339q.m9702c(r1, r8)
            if (r8 != 0) goto L55
            return r2
        L55:
            return r0
    }

    public final java.lang.String getCoreLiquidBalance() {
            r1 = this;
            java.lang.String r0 = r1.coreLiquidBalance
            return r0
    }

    public final md.C4581u getCpuLimit() {
            r1 = this;
            md.u r0 = r1.cpuLimit
            return r0
    }

    public final md.C4581u getNetLimit() {
            r1 = this;
            md.u r0 = r1.netLimit
            return r0
    }

    public final java.util.List<md.C4536a.a> getPermissions() {
            r1 = this;
            java.util.List<md.a$a> r0 = r1.permissions
            return r0
    }

    public final long getRamQuota() {
            r2 = this;
            long r0 = r2.ramQuota
            return r0
    }

    public final long getRamUsage() {
            r2 = this;
            long r0 = r2.ramUsage
            return r0
    }

    public final md.C4550e1 getVoterInfo() {
            r1 = this;
            md.e1 r0 = r1.voterInfo
            return r0
    }

    public int hashCode() {
            r7 = this;
            long r0 = r7.ramQuota
            r2 = 32
            long r3 = r0 >>> r2
            long r0 = r0 ^ r3
            int r1 = (int) r0
            int r1 = r1 * 31
            md.u r0 = r7.netLimit
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            md.u r1 = r7.cpuLimit
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            long r3 = r7.ramUsage
            long r5 = r3 >>> r2
            long r2 = r3 ^ r5
            int r0 = (int) r2
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r7.coreLiquidBalance
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r0, r1, r2)
            md.e1 r1 = r7.voterInfo
            if (r1 != 0) goto L34
            r1 = 0
            goto L38
        L34:
            int r1 = r1.hashCode()
        L38:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.List<md.a$a> r1 = r7.permissions
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "AccountInfo(ramQuota="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            long r1 = r3.ramQuota
            r0.append(r1)
            java.lang.String r1 = ", netLimit="
            r0.append(r1)
            md.u r1 = r3.netLimit
            r0.append(r1)
            java.lang.String r1 = ", cpuLimit="
            r0.append(r1)
            md.u r1 = r3.cpuLimit
            r0.append(r1)
            java.lang.String r1 = ", ramUsage="
            r0.append(r1)
            long r1 = r3.ramUsage
            r0.append(r1)
            java.lang.String r1 = ", coreLiquidBalance="
            r0.append(r1)
            java.lang.String r1 = r3.coreLiquidBalance
            r0.append(r1)
            java.lang.String r1 = ", voterInfo="
            r0.append(r1)
            md.e1 r1 = r3.voterInfo
            r0.append(r1)
            java.lang.String r1 = ", permissions="
            r0.append(r1)
            java.util.List<md.a$a> r1 = r3.permissions
            r2 = 41
            java.lang.String r0 = p213m1.C4320f.m9652a(r0, r1, r2)
            return r0
    }
}
