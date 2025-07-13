package p036c6;

/* renamed from: c6.d0 */
/* loaded from: classes.dex */
public final class C0880d0 implements android.os.Parcelable.Creator<p036c6.C0874b> {
    public C0880d0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p036c6.C0874b createFromParcel(android.os.Parcel r17) {
            r16 = this;
            r0 = r17
            int r1 = p270p6.C5368b.m11710t(r17)
            r2 = 0
            r3 = 0
            r5 = 0
            r7 = r3
            r10 = r7
            r9 = r5
            r13 = r9
            r12 = 0
            r14 = 0
            r15 = 0
        L11:
            int r2 = r17.dataPosition()
            if (r2 >= r1) goto L59
            int r2 = r17.readInt()
            r3 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r2
            switch(r3) {
                case 2: goto L54;
                case 3: goto L4f;
                case 4: goto L4a;
                case 5: goto L45;
                case 6: goto L30;
                case 7: goto L2b;
                case 8: goto L26;
                default: goto L22;
            }
        L22:
            p270p6.C5368b.m11709s(r0, r2)
            goto L11
        L26:
            boolean r15 = p270p6.C5368b.m11700j(r0, r2)
            goto L11
        L2b:
            boolean r14 = p270p6.C5368b.m11700j(r0, r2)
            goto L11
        L30:
            int r2 = p270p6.C5368b.m11708r(r0, r2)
            int r3 = r17.dataPosition()
            if (r2 != 0) goto L3c
            r13 = r5
            goto L11
        L3c:
            java.lang.String[] r13 = r17.createStringArray()
            int r3 = r3 + r2
            r0.setDataPosition(r3)
            goto L11
        L45:
            boolean r12 = p270p6.C5368b.m11700j(r0, r2)
            goto L11
        L4a:
            long r10 = p270p6.C5368b.m11706p(r0, r2)
            goto L11
        L4f:
            java.lang.String r9 = p270p6.C5368b.m11695e(r0, r2)
            goto L11
        L54:
            long r7 = p270p6.C5368b.m11706p(r0, r2)
            goto L11
        L59:
            p270p6.C5368b.m11699i(r0, r1)
            c6.b r0 = new c6.b
            r6 = r0
            r6.<init>(r7, r9, r10, r12, r13, r14, r15)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p036c6.C0874b[] newArray(int r1) {
            r0 = this;
            c6.b[] r1 = new p036c6.C0874b[r1]
            return r1
    }
}
