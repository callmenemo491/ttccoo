package p036c6;

/* renamed from: c6.s0 */
/* loaded from: classes.dex */
public final class C0910s0 implements android.os.Parcelable.Creator<p036c6.C0899n> {
    public C0910s0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p036c6.C0899n createFromParcel(android.os.Parcel r19) {
            r18 = this;
            r0 = r19
            int r1 = p270p6.C5368b.m11710t(r19)
            r2 = 0
            r3 = 0
            r5 = 0
            r10 = r3
            r12 = r10
            r14 = r12
            r7 = r5
            r16 = r7
            r17 = r16
            r8 = 0
            r9 = 0
        L14:
            int r2 = r19.dataPosition()
            if (r2 >= r1) goto L5f
            int r2 = r19.readInt()
            r3 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r2
            switch(r3) {
                case 2: goto L55;
                case 3: goto L4f;
                case 4: goto L49;
                case 5: goto L43;
                case 6: goto L3d;
                case 7: goto L37;
                case 8: goto L30;
                case 9: goto L29;
                default: goto L25;
            }
        L25:
            p270p6.C5368b.m11709s(r0, r2)
            goto L14
        L29:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r17 = r2
            goto L14
        L30:
            long[] r2 = p270p6.C5368b.m11693c(r0, r2)
            r16 = r2
            goto L14
        L37:
            double r2 = p270p6.C5368b.m11702l(r0, r2)
            r14 = r2
            goto L14
        L3d:
            double r2 = p270p6.C5368b.m11702l(r0, r2)
            r12 = r2
            goto L14
        L43:
            double r2 = p270p6.C5368b.m11702l(r0, r2)
            r10 = r2
            goto L14
        L49:
            boolean r2 = p270p6.C5368b.m11700j(r0, r2)
            r9 = r2
            goto L14
        L4f:
            int r2 = p270p6.C5368b.m11705o(r0, r2)
            r8 = r2
            goto L14
        L55:
            android.os.Parcelable$Creator<com.google.android.gms.cast.MediaInfo> r3 = com.google.android.gms.cast.MediaInfo.CREATOR
            android.os.Parcelable r2 = p270p6.C5368b.m11694d(r0, r2, r3)
            com.google.android.gms.cast.MediaInfo r2 = (com.google.android.gms.cast.MediaInfo) r2
            r7 = r2
            goto L14
        L5f:
            p270p6.C5368b.m11699i(r0, r1)
            c6.n r0 = new c6.n
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r12, r14, r16, r17)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p036c6.C0899n[] newArray(int r1) {
            r0 = this;
            c6.n[] r1 = new p036c6.C0899n[r1]
            return r1
    }
}
