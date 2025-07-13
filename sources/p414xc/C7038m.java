package p414xc;

/* renamed from: xc.m */
/* loaded from: classes.dex */
public class C7038m {
    private byte gFlag;

    /* renamed from: xc.m$a */
    public enum a extends java.lang.Enum<p414xc.C7038m.a> {
        private static final /* synthetic */ p414xc.C7038m.a[] $VALUES = null;
        public static final p414xc.C7038m.a BACKGROUND = null;
        public static final p414xc.C7038m.a BROADCAST = null;
        public static final p414xc.C7038m.a NONE = null;
        private byte gFlag;

        static {
                xc.m$a r0 = new xc.m$a
                java.lang.String r1 = "NONE"
                r2 = 0
                r0.<init>(r1, r2, r2)
                p414xc.C7038m.a.NONE = r0
                xc.m$a r1 = new xc.m$a
                java.lang.String r3 = "BROADCAST"
                r4 = 1
                r1.<init>(r3, r4, r4)
                p414xc.C7038m.a.BROADCAST = r1
                xc.m$a r3 = new xc.m$a
                java.lang.String r5 = "BACKGROUND"
                r6 = 2
                r3.<init>(r5, r6, r6)
                p414xc.C7038m.a.BACKGROUND = r3
                r5 = 3
                xc.m$a[] r5 = new p414xc.C7038m.a[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                p414xc.C7038m.a.$VALUES = r5
                return
        }

        a(java.lang.String r1, int r2, byte r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.gFlag = r3
                return
        }

        public static /* synthetic */ byte access$000(p414xc.C7038m.a r0) {
                byte r0 = r0.gFlag
                return r0
        }

        public static p414xc.C7038m.a valueOf(java.lang.String r1) {
                java.lang.Class<xc.m$a> r0 = p414xc.C7038m.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                xc.m$a r1 = (p414xc.C7038m.a) r1
                return r1
        }

        public static p414xc.C7038m.a[] values() {
                xc.m$a[] r0 = p414xc.C7038m.a.$VALUES
                java.lang.Object r0 = r0.clone()
                xc.m$a[] r0 = (p414xc.C7038m.a[]) r0
                return r0
        }

        public byte getFlag() {
                r1 = this;
                byte r0 = r1.gFlag
                return r0
        }
    }

    public C7038m(byte r1) {
            r0 = this;
            r0.<init>()
            r0.gFlag = r1
            return
    }

    public static p414xc.C7038m getDefault() {
            xc.m r0 = new xc.m
            r1 = 1
            r0.<init>(r1)
            return r0
    }

    public byte getFlagValue() {
            r1 = this;
            byte r0 = r1.gFlag
            return r0
    }

    public boolean isBackground() {
            r2 = this;
            byte r0 = r2.gFlag
            xc.m$a r1 = p414xc.C7038m.a.BACKGROUND
            byte r1 = r1.getFlag()
            r0 = r0 & r1
            if (r0 == 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    public boolean isBroadcast() {
            r2 = this;
            byte r0 = r2.gFlag
            xc.m$a r1 = p414xc.C7038m.a.BROADCAST
            byte r1 = r1.getFlag()
            r0 = r0 & r1
            if (r0 == 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    public void setBackground(boolean r2) {
            r1 = this;
            if (r2 == 0) goto Lc
            byte r2 = r1.gFlag
            xc.m$a r0 = p414xc.C7038m.a.BACKGROUND
            byte r0 = p414xc.C7038m.a.access$000(r0)
            r2 = r2 | r0
            goto L16
        Lc:
            byte r2 = r1.gFlag
            xc.m$a r0 = p414xc.C7038m.a.BACKGROUND
            byte r0 = p414xc.C7038m.a.access$000(r0)
            int r0 = ~r0
            r2 = r2 & r0
        L16:
            byte r2 = (byte) r2
            r1.gFlag = r2
            return
    }

    public void setBroadcast(boolean r2) {
            r1 = this;
            if (r2 == 0) goto Lc
            byte r2 = r1.gFlag
            xc.m$a r0 = p414xc.C7038m.a.BROADCAST
            byte r0 = p414xc.C7038m.a.access$000(r0)
            r2 = r2 | r0
            goto L16
        Lc:
            byte r2 = r1.gFlag
            xc.m$a r0 = p414xc.C7038m.a.BROADCAST
            byte r0 = p414xc.C7038m.a.access$000(r0)
            int r0 = ~r0
            r2 = r2 & r0
        L16:
            byte r2 = (byte) r2
            r1.gFlag = r2
            return
    }
}
