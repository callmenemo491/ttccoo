package p396we;

/* renamed from: we.c */
/* loaded from: classes.dex */
public final class C6846c {
    private final java.lang.String asset_id;
    private final java.lang.String available;
    private final int health;
    private final java.lang.String slot_id;
    private final java.lang.String template_id;

    public C6846c(java.lang.String r2, java.lang.String r3, int r4, java.lang.String r5, java.lang.String r6) {
            r1 = this;
            java.lang.String r0 = "asset_id"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "available"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "slot_id"
            p214m2.C4339q.m9706k(r5, r0)
            java.lang.String r0 = "template_id"
            p214m2.C4339q.m9706k(r6, r0)
            r1.<init>()
            r1.asset_id = r2
            r1.available = r3
            r1.health = r4
            r1.slot_id = r5
            r1.template_id = r6
            return
    }

    private final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.available
            return r0
    }

    public static /* synthetic */ p396we.C6846c copy$default(p396we.C6846c r3, java.lang.String r4, java.lang.String r5, int r6, java.lang.String r7, java.lang.String r8, int r9, java.lang.Object r10) {
            r10 = r9 & 1
            if (r10 == 0) goto L6
            java.lang.String r4 = r3.asset_id
        L6:
            r10 = r9 & 2
            if (r10 == 0) goto Lc
            java.lang.String r5 = r3.available
        Lc:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L13
            int r6 = r3.health
        L13:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L1a
            java.lang.String r7 = r3.slot_id
        L1a:
            r1 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L21
            java.lang.String r8 = r3.template_id
        L21:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            r10 = r2
            we.c r3 = r5.copy(r6, r7, r8, r9, r10)
            return r3
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.asset_id
            return r0
    }

    public final int component3() {
            r1 = this;
            int r0 = r1.health
            return r0
    }

    public final java.lang.String component4() {
            r1 = this;
            java.lang.String r0 = r1.slot_id
            return r0
    }

    public final java.lang.String component5() {
            r1 = this;
            java.lang.String r0 = r1.template_id
            return r0
    }

    public final p396we.C6846c copy(java.lang.String r8, java.lang.String r9, int r10, java.lang.String r11, java.lang.String r12) {
            r7 = this;
            java.lang.String r0 = "asset_id"
            p214m2.C4339q.m9706k(r8, r0)
            java.lang.String r0 = "available"
            p214m2.C4339q.m9706k(r9, r0)
            java.lang.String r0 = "slot_id"
            p214m2.C4339q.m9706k(r11, r0)
            java.lang.String r0 = "template_id"
            p214m2.C4339q.m9706k(r12, r0)
            we.c r0 = new we.c
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p396we.C6846c
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            we.c r5 = (p396we.C6846c) r5
            java.lang.String r1 = r4.asset_id
            java.lang.String r3 = r5.asset_id
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.available
            java.lang.String r3 = r5.available
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            int r1 = r4.health
            int r3 = r5.health
            if (r1 == r3) goto L29
            return r2
        L29:
            java.lang.String r1 = r4.slot_id
            java.lang.String r3 = r5.slot_id
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L34
            return r2
        L34:
            java.lang.String r1 = r4.template_id
            java.lang.String r5 = r5.template_id
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L3f
            return r2
        L3f:
            return r0
    }

    public final java.lang.String getAsset_id() {
            r1 = this;
            java.lang.String r0 = r1.asset_id
            return r0
    }

    public final int getHealth() {
            r1 = this;
            int r0 = r1.health
            return r0
    }

    public final java.lang.String getSlot_id() {
            r1 = this;
            java.lang.String r0 = r1.slot_id
            return r0
    }

    public final java.lang.String getTemplate_id() {
            r1 = this;
            java.lang.String r0 = r1.template_id
            return r0
    }

    public final long getTimeStampSec() {
            r4 = this;
            java.lang.String r0 = r4.available
            java.lang.String r1 = "yyyy-MM-dd'T'HH:mm:ss"
            java.util.Calendar r0 = vg.C6664e.m13502c(r0, r1)
            if (r0 == 0) goto Lf
            long r0 = r0.getTimeInMillis()
            goto L11
        Lf:
            r0 = 0
        L11:
            r2 = 1000(0x3e8, float:1.401E-42)
            long r2 = (long) r2
            long r0 = r0 / r2
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.asset_id
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r3.available
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            int r1 = r3.health
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r3.slot_id
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r3.template_id
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "Brawler(asset_id="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.asset_id
            r0.append(r1)
            java.lang.String r1 = ", available="
            r0.append(r1)
            java.lang.String r1 = r3.available
            r0.append(r1)
            java.lang.String r1 = ", health="
            r0.append(r1)
            int r1 = r3.health
            r0.append(r1)
            java.lang.String r1 = ", slot_id="
            r0.append(r1)
            java.lang.String r1 = r3.slot_id
            r0.append(r1)
            java.lang.String r1 = ", template_id="
            r0.append(r1)
            java.lang.String r1 = r3.template_id
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
