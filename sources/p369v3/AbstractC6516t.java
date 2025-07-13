package p369v3;

@com.google.auto.value.AutoValue
/* renamed from: v3.t */
/* loaded from: classes.dex */
public abstract class AbstractC6516t {

    /* renamed from: v3.t$a */
    public enum a extends java.lang.Enum<p369v3.AbstractC6516t.a> {

        /* renamed from: Z */
        public static final p369v3.AbstractC6516t.a f25257Z = null;

        /* renamed from: a0 */
        public static final p369v3.AbstractC6516t.a f25258a0 = null;

        /* renamed from: b0 */
        public static final android.util.SparseArray<p369v3.AbstractC6516t.a> f25259b0 = null;

        /* renamed from: c0 */
        public static final /* synthetic */ p369v3.AbstractC6516t.a[] f25260c0 = null;

        /* renamed from: Y */
        public final int f25261Y;

        static {
                v3.t$a r0 = new v3.t$a
                java.lang.String r1 = "UNKNOWN_MOBILE_SUBTYPE"
                r2 = 0
                r0.<init>(r1, r2, r2)
                p369v3.AbstractC6516t.a.f25257Z = r0
                v3.t$a r1 = new v3.t$a
                java.lang.String r3 = "GPRS"
                r4 = 1
                r1.<init>(r3, r4, r4)
                v3.t$a r3 = new v3.t$a
                java.lang.String r5 = "EDGE"
                r6 = 2
                r3.<init>(r5, r6, r6)
                v3.t$a r5 = new v3.t$a
                java.lang.String r7 = "UMTS"
                r8 = 3
                r5.<init>(r7, r8, r8)
                v3.t$a r7 = new v3.t$a
                java.lang.String r9 = "CDMA"
                r10 = 4
                r7.<init>(r9, r10, r10)
                v3.t$a r9 = new v3.t$a
                java.lang.String r11 = "EVDO_0"
                r12 = 5
                r9.<init>(r11, r12, r12)
                v3.t$a r11 = new v3.t$a
                java.lang.String r13 = "EVDO_A"
                r14 = 6
                r11.<init>(r13, r14, r14)
                v3.t$a r13 = new v3.t$a
                java.lang.String r15 = "RTT"
                r14 = 7
                r13.<init>(r15, r14, r14)
                v3.t$a r15 = new v3.t$a
                java.lang.String r14 = "HSDPA"
                r12 = 8
                r15.<init>(r14, r12, r12)
                v3.t$a r14 = new v3.t$a
                java.lang.String r12 = "HSUPA"
                r10 = 9
                r14.<init>(r12, r10, r10)
                v3.t$a r12 = new v3.t$a
                java.lang.String r10 = "HSPA"
                r8 = 10
                r12.<init>(r10, r8, r8)
                v3.t$a r10 = new v3.t$a
                java.lang.String r8 = "IDEN"
                r6 = 11
                r10.<init>(r8, r6, r6)
                v3.t$a r8 = new v3.t$a
                java.lang.String r6 = "EVDO_B"
                r4 = 12
                r8.<init>(r6, r4, r4)
                v3.t$a r6 = new v3.t$a
                java.lang.String r4 = "LTE"
                r2 = 13
                r6.<init>(r4, r2, r2)
                v3.t$a r4 = new v3.t$a
                java.lang.String r2 = "EHRPD"
                r16 = r6
                r6 = 14
                r4.<init>(r2, r6, r6)
                v3.t$a r2 = new v3.t$a
                java.lang.String r6 = "HSPAP"
                r17 = r4
                r4 = 15
                r2.<init>(r6, r4, r4)
                v3.t$a r6 = new v3.t$a
                java.lang.String r4 = "GSM"
                r18 = r2
                r2 = 16
                r6.<init>(r4, r2, r2)
                v3.t$a r4 = new v3.t$a
                java.lang.String r2 = "TD_SCDMA"
                r19 = r6
                r6 = 17
                r4.<init>(r2, r6, r6)
                v3.t$a r2 = new v3.t$a
                java.lang.String r6 = "IWLAN"
                r20 = r4
                r4 = 18
                r2.<init>(r6, r4, r4)
                v3.t$a r6 = new v3.t$a
                java.lang.String r4 = "LTE_CA"
                r21 = r2
                r2 = 19
                r6.<init>(r4, r2, r2)
                v3.t$a r4 = new v3.t$a
                java.lang.String r2 = "COMBINED"
                r22 = r6
                r6 = 20
                r23 = r8
                r8 = 100
                r4.<init>(r2, r6, r8)
                p369v3.AbstractC6516t.a.f25258a0 = r4
                r2 = 21
                v3.t$a[] r2 = new p369v3.AbstractC6516t.a[r2]
                r8 = 0
                r2[r8] = r0
                r8 = 1
                r2[r8] = r1
                r8 = 2
                r2[r8] = r3
                r8 = 3
                r2[r8] = r5
                r8 = 4
                r2[r8] = r7
                r8 = 5
                r2[r8] = r9
                r8 = 6
                r2[r8] = r11
                r8 = 7
                r2[r8] = r13
                r8 = 8
                r2[r8] = r15
                r8 = 9
                r2[r8] = r14
                r8 = 10
                r2[r8] = r12
                r8 = 11
                r2[r8] = r10
                r8 = 12
                r2[r8] = r23
                r8 = 13
                r2[r8] = r16
                r8 = 14
                r2[r8] = r17
                r8 = 15
                r2[r8] = r18
                r8 = 16
                r2[r8] = r19
                r8 = 17
                r2[r8] = r20
                r8 = 18
                r2[r8] = r21
                r8 = 19
                r2[r8] = r22
                r2[r6] = r4
                p369v3.AbstractC6516t.a.f25260c0 = r2
                android.util.SparseArray r2 = new android.util.SparseArray
                r2.<init>()
                p369v3.AbstractC6516t.a.f25259b0 = r2
                r4 = 0
                r2.put(r4, r0)
                r0 = 1
                r2.put(r0, r1)
                r0 = 2
                r2.put(r0, r3)
                r0 = 3
                r2.put(r0, r5)
                r0 = 4
                r2.put(r0, r7)
                r0 = 5
                r2.put(r0, r9)
                r0 = 6
                r2.put(r0, r11)
                r0 = 7
                r2.put(r0, r13)
                r0 = 8
                r2.put(r0, r15)
                r0 = 9
                r2.put(r0, r14)
                r0 = 10
                r2.put(r0, r12)
                r0 = 11
                r2.put(r0, r10)
                r0 = r23
                r1 = 12
                r2.put(r1, r0)
                r0 = r16
                r1 = 13
                r2.put(r1, r0)
                r0 = r17
                r1 = 14
                r2.put(r1, r0)
                r0 = r18
                r1 = 15
                r2.put(r1, r0)
                r0 = r19
                r1 = 16
                r2.put(r1, r0)
                r0 = r20
                r1 = 17
                r2.put(r1, r0)
                r0 = r21
                r1 = 18
                r2.put(r1, r0)
                r0 = r22
                r1 = 19
                r2.put(r1, r0)
                return
        }

        a(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.f25261Y = r3
                return
        }

        public static p369v3.AbstractC6516t.a valueOf(java.lang.String r1) {
                java.lang.Class<v3.t$a> r0 = p369v3.AbstractC6516t.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                v3.t$a r1 = (p369v3.AbstractC6516t.a) r1
                return r1
        }

        public static p369v3.AbstractC6516t.a[] values() {
                v3.t$a[] r0 = p369v3.AbstractC6516t.a.f25260c0
                java.lang.Object r0 = r0.clone()
                v3.t$a[] r0 = (p369v3.AbstractC6516t.a[]) r0
                return r0
        }
    }

    /* renamed from: v3.t$b */
    public enum b extends java.lang.Enum<p369v3.AbstractC6516t.b> {

        /* renamed from: Z */
        public static final p369v3.AbstractC6516t.b f25262Z = null;

        /* renamed from: a0 */
        public static final android.util.SparseArray<p369v3.AbstractC6516t.b> f25263a0 = null;

        /* renamed from: b0 */
        public static final /* synthetic */ p369v3.AbstractC6516t.b[] f25264b0 = null;

        /* renamed from: Y */
        public final int f25265Y;

        static {
                v3.t$b r0 = new v3.t$b
                java.lang.String r1 = "MOBILE"
                r2 = 0
                r0.<init>(r1, r2, r2)
                v3.t$b r1 = new v3.t$b
                java.lang.String r3 = "WIFI"
                r4 = 1
                r1.<init>(r3, r4, r4)
                v3.t$b r3 = new v3.t$b
                java.lang.String r5 = "MOBILE_MMS"
                r6 = 2
                r3.<init>(r5, r6, r6)
                v3.t$b r5 = new v3.t$b
                java.lang.String r7 = "MOBILE_SUPL"
                r8 = 3
                r5.<init>(r7, r8, r8)
                v3.t$b r7 = new v3.t$b
                java.lang.String r9 = "MOBILE_DUN"
                r10 = 4
                r7.<init>(r9, r10, r10)
                v3.t$b r9 = new v3.t$b
                java.lang.String r11 = "MOBILE_HIPRI"
                r12 = 5
                r9.<init>(r11, r12, r12)
                v3.t$b r11 = new v3.t$b
                java.lang.String r13 = "WIMAX"
                r14 = 6
                r11.<init>(r13, r14, r14)
                v3.t$b r13 = new v3.t$b
                java.lang.String r15 = "BLUETOOTH"
                r14 = 7
                r13.<init>(r15, r14, r14)
                v3.t$b r15 = new v3.t$b
                java.lang.String r14 = "DUMMY"
                r12 = 8
                r15.<init>(r14, r12, r12)
                v3.t$b r14 = new v3.t$b
                java.lang.String r12 = "ETHERNET"
                r10 = 9
                r14.<init>(r12, r10, r10)
                v3.t$b r12 = new v3.t$b
                java.lang.String r10 = "MOBILE_FOTA"
                r8 = 10
                r12.<init>(r10, r8, r8)
                v3.t$b r10 = new v3.t$b
                java.lang.String r8 = "MOBILE_IMS"
                r6 = 11
                r10.<init>(r8, r6, r6)
                v3.t$b r8 = new v3.t$b
                java.lang.String r6 = "MOBILE_CBS"
                r4 = 12
                r8.<init>(r6, r4, r4)
                v3.t$b r6 = new v3.t$b
                java.lang.String r4 = "WIFI_P2P"
                r2 = 13
                r6.<init>(r4, r2, r2)
                v3.t$b r4 = new v3.t$b
                java.lang.String r2 = "MOBILE_IA"
                r30 = r6
                r6 = 14
                r4.<init>(r2, r6, r6)
                v3.t$b r2 = new v3.t$b
                java.lang.String r6 = "MOBILE_EMERGENCY"
                r32 = r4
                r4 = 15
                r2.<init>(r6, r4, r4)
                v3.t$b r6 = new v3.t$b
                java.lang.String r4 = "PROXY"
                r34 = r2
                r2 = 16
                r6.<init>(r4, r2, r2)
                v3.t$b r4 = new v3.t$b
                java.lang.String r2 = "VPN"
                r36 = r6
                r6 = 17
                r4.<init>(r2, r6, r6)
                v3.t$b r2 = new v3.t$b
                java.lang.String r6 = "NONE"
                r38 = r4
                r4 = 18
                r39 = r8
                r8 = -1
                r2.<init>(r6, r4, r8)
                p369v3.AbstractC6516t.b.f25262Z = r2
                r6 = 19
                v3.t$b[] r6 = new p369v3.AbstractC6516t.b[r6]
                r28 = 0
                r6[r28] = r0
                r26 = 1
                r6[r26] = r1
                r24 = 2
                r6[r24] = r3
                r22 = 3
                r6[r22] = r5
                r20 = 4
                r6[r20] = r7
                r18 = 5
                r6[r18] = r9
                r16 = 6
                r6[r16] = r11
                r17 = 7
                r6[r17] = r13
                r19 = 8
                r6[r19] = r15
                r21 = 9
                r6[r21] = r14
                r23 = 10
                r6[r23] = r12
                r25 = 11
                r6[r25] = r10
                r27 = 12
                r6[r27] = r39
                r29 = 13
                r6[r29] = r30
                r31 = 14
                r6[r31] = r32
                r33 = 15
                r6[r33] = r34
                r35 = 16
                r6[r35] = r36
                r37 = 17
                r6[r37] = r38
                r6[r4] = r2
                p369v3.AbstractC6516t.b.f25264b0 = r6
                android.util.SparseArray r4 = new android.util.SparseArray
                r4.<init>()
                p369v3.AbstractC6516t.b.f25263a0 = r4
                r6 = 0
                r4.put(r6, r0)
                r0 = 1
                r4.put(r0, r1)
                r0 = 2
                r4.put(r0, r3)
                r0 = 3
                r4.put(r0, r5)
                r0 = 4
                r4.put(r0, r7)
                r0 = 5
                r4.put(r0, r9)
                r0 = 6
                r4.put(r0, r11)
                r0 = 7
                r4.put(r0, r13)
                r0 = 8
                r4.put(r0, r15)
                r0 = 9
                r4.put(r0, r14)
                r0 = 10
                r4.put(r0, r12)
                r0 = 11
                r4.put(r0, r10)
                r0 = r39
                r1 = 12
                r4.put(r1, r0)
                r0 = r30
                r1 = 13
                r4.put(r1, r0)
                r0 = r32
                r1 = 14
                r4.put(r1, r0)
                r0 = r34
                r1 = 15
                r4.put(r1, r0)
                r0 = r36
                r1 = 16
                r4.put(r1, r0)
                r0 = r38
                r1 = 17
                r4.put(r1, r0)
                r4.put(r8, r2)
                return
        }

        b(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.f25265Y = r3
                return
        }

        public static p369v3.AbstractC6516t.b valueOf(java.lang.String r1) {
                java.lang.Class<v3.t$b> r0 = p369v3.AbstractC6516t.b.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                v3.t$b r1 = (p369v3.AbstractC6516t.b) r1
                return r1
        }

        public static p369v3.AbstractC6516t.b[] values() {
                v3.t$b[] r0 = p369v3.AbstractC6516t.b.f25264b0
                java.lang.Object r0 = r0.clone()
                v3.t$b[] r0 = (p369v3.AbstractC6516t.b[]) r0
                return r0
        }
    }

    public AbstractC6516t() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public abstract p369v3.AbstractC6516t.a mo13238a();

    /* renamed from: b */
    public abstract p369v3.AbstractC6516t.b mo13239b();
}
