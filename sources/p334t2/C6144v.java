package p334t2;

/* renamed from: t2.v */
/* loaded from: classes.dex */
public final class C6144v {

    /* renamed from: a */
    public static final android.graphics.Paint f23726a = null;

    /* renamed from: b */
    public static final java.util.concurrent.locks.Lock f23727b = null;

    /* renamed from: t2.v$a */
    public static final class a implements java.util.concurrent.locks.Lock {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.concurrent.locks.Lock
        public void lock() {
                r0 = this;
                return
        }

        @Override // java.util.concurrent.locks.Lock
        public void lockInterruptibly() {
                r0 = this;
                return
        }

        @Override // java.util.concurrent.locks.Lock
        public java.util.concurrent.locks.Condition newCondition() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Should not be called"
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock(long r1, java.util.concurrent.TimeUnit r3) {
                r0 = this;
                r1 = 1
                return r1
        }

        @Override // java.util.concurrent.locks.Lock
        public void unlock() {
                r0 = this;
                return
        }
    }

    static {
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 6
            r0.<init>(r1)
            p334t2.C6144v.f23726a = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 7
            r0.<init>(r1)
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r2 = "XT1085"
            java.lang.String r3 = "XT1092"
            java.lang.String r4 = "XT1093"
            java.lang.String r5 = "XT1094"
            java.lang.String r6 = "XT1095"
            java.lang.String r7 = "XT1096"
            java.lang.String r8 = "XT1097"
            java.lang.String r9 = "XT1098"
            java.lang.String r10 = "XT1031"
            java.lang.String r11 = "XT1028"
            java.lang.String r12 = "XT937C"
            java.lang.String r13 = "XT1032"
            java.lang.String r14 = "XT1008"
            java.lang.String r15 = "XT1033"
            java.lang.String r16 = "XT1035"
            java.lang.String r17 = "XT1034"
            java.lang.String r18 = "XT939G"
            java.lang.String r19 = "XT1039"
            java.lang.String r20 = "XT1040"
            java.lang.String r21 = "XT1042"
            java.lang.String r22 = "XT1045"
            java.lang.String r23 = "XT1063"
            java.lang.String r24 = "XT1064"
            java.lang.String r25 = "XT1068"
            java.lang.String r26 = "XT1069"
            java.lang.String r27 = "XT1072"
            java.lang.String r28 = "XT1077"
            java.lang.String r29 = "XT1078"
            java.lang.String r30 = "XT1079"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30}
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.<init>(r2)
            java.lang.String r2 = android.os.Build.MODEL
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L63
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            goto L68
        L63:
            t2.v$a r0 = new t2.v$a
            r0.<init>()
        L68:
            p334t2.C6144v.f23727b = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r1)
            android.graphics.PorterDuffXfermode r1 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            r1.<init>(r2)
            r0.setXfermode(r1)
            return
    }

    /* renamed from: a */
    public static void m12690a(android.graphics.Bitmap r2, android.graphics.Bitmap r3, android.graphics.Matrix r4) {
            java.util.concurrent.locks.Lock r0 = p334t2.C6144v.f23727b
            r0.lock()
            android.graphics.Canvas r1 = new android.graphics.Canvas     // Catch: java.lang.Throwable -> L17
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L17
            android.graphics.Paint r3 = p334t2.C6144v.f23726a     // Catch: java.lang.Throwable -> L17
            r1.drawBitmap(r2, r4, r3)     // Catch: java.lang.Throwable -> L17
            r2 = 0
            r1.setBitmap(r2)     // Catch: java.lang.Throwable -> L17
            r0.unlock()
            return
        L17:
            r2 = move-exception
            java.util.concurrent.locks.Lock r3 = p334t2.C6144v.f23727b
            r3.unlock()
            throw r2
    }

    /* renamed from: b */
    public static android.graphics.Bitmap m12691b(p229n2.InterfaceC4673c r6, android.graphics.Bitmap r7, int r8, int r9) {
            int r0 = r7.getWidth()
            r1 = 2
            java.lang.String r2 = "TransformationUtils"
            if (r0 != r8) goto L1b
            int r0 = r7.getHeight()
            if (r0 != r9) goto L1b
            boolean r6 = android.util.Log.isLoggable(r2, r1)
            if (r6 == 0) goto L1a
            java.lang.String r6 = "requested target size matches input, returning input"
            android.util.Log.v(r2, r6)
        L1a:
            return r7
        L1b:
            float r0 = (float) r8
            int r3 = r7.getWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            float r3 = (float) r9
            int r4 = r7.getHeight()
            float r4 = (float) r4
            float r3 = r3 / r4
            float r0 = java.lang.Math.min(r0, r3)
            int r3 = r7.getWidth()
            float r3 = (float) r3
            float r3 = r3 * r0
            int r3 = java.lang.Math.round(r3)
            int r4 = r7.getHeight()
            float r4 = (float) r4
            float r4 = r4 * r0
            int r4 = java.lang.Math.round(r4)
            int r5 = r7.getWidth()
            if (r5 != r3) goto L5b
            int r3 = r7.getHeight()
            if (r3 != r4) goto L5b
            boolean r6 = android.util.Log.isLoggable(r2, r1)
            if (r6 == 0) goto L5a
            java.lang.String r6 = "adjusted target size matches input, returning input"
            android.util.Log.v(r2, r6)
        L5a:
            return r7
        L5b:
            int r3 = r7.getWidth()
            float r3 = (float) r3
            float r3 = r3 * r0
            int r3 = (int) r3
            int r4 = r7.getHeight()
            float r4 = (float) r4
            float r4 = r4 * r0
            int r4 = (int) r4
            android.graphics.Bitmap$Config r5 = m12692c(r7)
            android.graphics.Bitmap r6 = r6.mo10693e(r3, r4, r5)
            boolean r3 = r7.hasAlpha()
            r6.setHasAlpha(r3)
            boolean r1 = android.util.Log.isLoggable(r2, r1)
            if (r1 == 0) goto Lf4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "request: "
            r1.append(r3)
            r1.append(r8)
            java.lang.String r8 = "x"
            r1.append(r8)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            android.util.Log.v(r2, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r1 = "toFit:   "
            r9.append(r1)
            int r1 = r7.getWidth()
            r9.append(r1)
            r9.append(r8)
            int r1 = r7.getHeight()
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            android.util.Log.v(r2, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r1 = "toReuse: "
            r9.append(r1)
            int r1 = r6.getWidth()
            r9.append(r1)
            r9.append(r8)
            int r8 = r6.getHeight()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            android.util.Log.v(r2, r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "minPct:   "
            r8.append(r9)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            android.util.Log.v(r2, r8)
        Lf4:
            android.graphics.Matrix r8 = new android.graphics.Matrix
            r8.<init>()
            r8.setScale(r0, r0)
            m12690a(r7, r6, r8)
            return r6
    }

    /* renamed from: c */
    public static android.graphics.Bitmap.Config m12692c(android.graphics.Bitmap r1) {
            android.graphics.Bitmap$Config r0 = r1.getConfig()
            if (r0 == 0) goto Lb
            android.graphics.Bitmap$Config r1 = r1.getConfig()
            goto Ld
        Lb:
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
        Ld:
            return r1
    }
}
