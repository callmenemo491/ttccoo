package p123h6;

/* renamed from: h6.g0 */
/* loaded from: classes.dex */
public final class C2500g0 implements android.os.Parcelable.Creator<p123h6.C2498f0> {
    public C2500g0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p123h6.C2498f0 createFromParcel(android.os.Parcel r17) {
            r16 = this;
            r0 = r17
            int r1 = p270p6.C5368b.m11710t(r17)
            r2 = 0
            r3 = 0
            r4 = 0
            r11 = r3
            r13 = r11
            r7 = r4
            r14 = r7
            r9 = 0
            r10 = 0
            r12 = 0
        L11:
            int r2 = r17.dataPosition()
            if (r2 >= r1) goto L53
            int r2 = r17.readInt()
            r3 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r2
            switch(r3) {
                case 2: goto L4e;
                case 3: goto L49;
                case 4: goto L44;
                case 5: goto L3a;
                case 6: goto L35;
                case 7: goto L2b;
                case 8: goto L26;
                default: goto L22;
            }
        L22:
            p270p6.C5368b.m11709s(r0, r2)
            goto L11
        L26:
            double r14 = p270p6.C5368b.m11702l(r0, r2)
            goto L11
        L2b:
            android.os.Parcelable$Creator<c6.y> r3 = p036c6.C0921y.CREATOR
            android.os.Parcelable r2 = p270p6.C5368b.m11694d(r0, r2, r3)
            r13 = r2
            c6.y r13 = (p036c6.C0921y) r13
            goto L11
        L35:
            int r12 = p270p6.C5368b.m11705o(r0, r2)
            goto L11
        L3a:
            android.os.Parcelable$Creator<c6.d> r3 = p036c6.C0879d.CREATOR
            android.os.Parcelable r2 = p270p6.C5368b.m11694d(r0, r2, r3)
            r11 = r2
            c6.d r11 = (p036c6.C0879d) r11
            goto L11
        L44:
            int r10 = p270p6.C5368b.m11705o(r0, r2)
            goto L11
        L49:
            boolean r9 = p270p6.C5368b.m11700j(r0, r2)
            goto L11
        L4e:
            double r7 = p270p6.C5368b.m11702l(r0, r2)
            goto L11
        L53:
            p270p6.C5368b.m11699i(r0, r1)
            h6.f0 r0 = new h6.f0
            r6 = r0
            r6.<init>(r7, r9, r10, r11, r12, r13, r14)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p123h6.C2498f0[] newArray(int r1) {
            r0 = this;
            h6.f0[] r1 = new p123h6.C2498f0[r1]
            return r1
    }
}
